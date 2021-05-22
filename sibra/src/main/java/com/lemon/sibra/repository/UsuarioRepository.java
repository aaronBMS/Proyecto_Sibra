package com.lemon.sibra.repository;

import com.lemon.sibra.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    
}
