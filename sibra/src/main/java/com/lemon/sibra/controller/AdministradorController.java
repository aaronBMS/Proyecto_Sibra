package com.lemon.sibra.controller;

import java.util.List;

import com.lemon.sibra.dto.Mensaje;
import com.lemon.sibra.model.Administrador;
import com.lemon.sibra.service.AdministradorService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administrador/")
public class AdministradorController {
    
    @Autowired
    AdministradorService administradorService;

    @GetMapping("/lista")
    public ResponseEntity<List<Administrador>> list(){
        List<Administrador> list=administradorService.list();
        return new ResponseEntity<List<Administrador>>(list,HttpStatus.OK);
    }

    @PostMapping("/createadmin")
    public ResponseEntity<?> create(@RequestBody Administrador administrador){
        if(StringUtils.isBlank(administrador.getDNI()+""))
            return new ResponseEntity<>(new Mensaje("Ingrese su DNI"),HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(administrador.getNombre()))
            return new ResponseEntity<>(new Mensaje("Ingrese su Nombre"),HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(administrador.getApellido()))
            return new ResponseEntity<>(new Mensaje("Ingrese su Apellido"),HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(administrador.getCorreo()))
            return new ResponseEntity<>(new Mensaje("Ingrese su Correo"),HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(administrador.getTelefono()+""))
            return new ResponseEntity<>(new Mensaje("Ingrese su Teléfono"),HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(administrador.getUsuario()))
            return new ResponseEntity<>(new Mensaje("Ingrese su Usuario"),HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(administrador.getContraseña()))
            return new ResponseEntity<>(new Mensaje("Ingrese su Contraseña"),HttpStatus.BAD_REQUEST);
        Administrador administrator=new Administrador(administrador.getDNI(),administrador.getCodigo(),administrador.getNombre(),administrador.getApellido(),administrador.getCorreo(),administrador.getTelefono(),administrador.getCargo(),administrador.getUsuario(),administrador.getContraseña());
        administradorService.save(administrator);
        return new ResponseEntity<>(new Mensaje("Cuenta Creada"),HttpStatus.OK);
    }   
}
