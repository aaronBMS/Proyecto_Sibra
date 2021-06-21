package com.lemon.sibra.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import com.lemon.sibra.security.enums.RolNombre;
import com.lemon.sibra.security.model.Rol;
import com.lemon.sibra.security.repository.RolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByNombre(rolNombre);
    }
}
