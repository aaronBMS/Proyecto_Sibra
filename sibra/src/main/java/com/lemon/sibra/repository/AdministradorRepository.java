package com.lemon.sibra.repository;

import java.util.Optional;

import com.lemon.sibra.model.Administrador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador,Integer>{
    
    Optional<Administrador> findByUsuario(String usuario);
    boolean existsByUsuario(String usuario);
}
