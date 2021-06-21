package com.lemon.sibra.security.repository;

import java.util.Optional;

import com.lemon.sibra.security.enums.RolNombre;
import com.lemon.sibra.security.model.Rol;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    
    Optional<Rol> findByNombre(RolNombre rolNombre);
}
