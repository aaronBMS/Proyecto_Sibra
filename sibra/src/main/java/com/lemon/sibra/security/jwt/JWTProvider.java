package com.lemon.sibra.security.jwt;

import java.util.Date;

import com.lemon.sibra.security.model.UsuarioPrincipal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

@Component
public class JWTProvider {
    
    private final static Logger logger=LoggerFactory.getLogger(JWTProvider.class);

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jet.expiration}")
    private int expiration;

    public String generateToken(Authentication authentication){
        UsuarioPrincipal usuarioPrincipal = (UsuarioPrincipal) authentication.getPrincipal();
        return Jwts.builder().setSubject(usuarioPrincipal.getUsername())
        .setIssuedAt(new Date())
        .setExpiration(new Date(new Date().getTime()+expiration*1000))
        .signWith(SignatureAlgorithm.HS512,secret).compact();
    }

    public String getNombreUsuarioFromToken(String token){
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }

    public boolean validateToken(String token){
        try{
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return true;
        }catch(MalformedJwtException e){
            logger.error("Token Mal Formado");
        }catch(UnsupportedJwtException e){
            logger.error("Token No Soportado");
        }catch(ExpiredJwtException e){
            logger.error("Token Expirado");
        }catch(IllegalArgumentException e){
            logger.error("Token Vacío");
        }catch(SignatureException e){
            logger.error("Fallo Con la Firma");
        }
        return false;
    }
}
