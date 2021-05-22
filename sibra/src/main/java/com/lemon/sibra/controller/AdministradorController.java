package com.lemon.sibra.controller;

import java.util.List;

import com.lemon.sibra.model.Administrador;
import com.lemon.sibra.service.AdministradorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {
    
    @Autowired
    private AdministradorService administradorService;

    @GetMapping
    private ResponseEntity<List<Administrador>> getAllAdministrator(){
        return ResponseEntity.ok(administradorService.findAll());
    }
}
