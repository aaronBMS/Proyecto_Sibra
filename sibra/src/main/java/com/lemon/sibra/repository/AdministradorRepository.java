package com.lemon.sibra.repository;

import com.lemon.sibra.model.Administrador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador,Integer>{
    
    Administrador findByUsuario(String usuario);
    boolean existsByUsuario(String usuario);
}
