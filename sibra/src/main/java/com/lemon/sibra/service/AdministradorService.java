package com.lemon.sibra.service;

import java.util.List;
import java.util.Optional;

import com.lemon.sibra.model.Administrador;
import com.lemon.sibra.repository.AdministradorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdministradorService{
    
    @Autowired
    AdministradorRepository administradorRepository;

    public List<Administrador> list(){
        return administradorRepository.findAll();
    }

    public Optional<Administrador> getOneAdmin(int DNI){
        return administradorRepository.findById(DNI);
    }

    public Optional<Administrador> getByUser(String user){
        return administradorRepository.findByUsuario(user);
    }

    public void save(Administrador administrador){
        administradorRepository.save(administrador);
    }

    public void delete(int DNI){
        administradorRepository.deleteById(DNI);
    }

    public boolean existsByDNI(int DNI){
        return administradorRepository.existsById(DNI);
    }
}
