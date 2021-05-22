package com.lemon.sibra.service;

import java.util.List;
import java.util.Optional;

import com.lemon.sibra.model.Administrador;
import com.lemon.sibra.repository.AdministradorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class AdministradorService implements AdministradorRepository{
    
    @Autowired
    private AdministradorRepository administradorRepository;

    @Override
    public List<Administrador> findAll() {
        return administradorRepository.findAll();
    }

    @Override
    public List<Administrador> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<Administrador> findAllById(Iterable<Long> ids) {
        return null;
    }

    @Override
    public <S extends Administrador> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() {
    }

    @Override
    public <S extends Administrador> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Administrador> entities) {
    }

    @Override
    public void deleteAllInBatch() {
    }

    @Override
    public Administrador getOne(Long id) {
        return null;
    }

    @Override
    public <S extends Administrador> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Administrador> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public Page<Administrador> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Administrador> S save(S entity) {
        return null;
    }

    @Override
    public Optional<Administrador> findById(Long id) {
        return null;
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {  
    }

    @Override
    public void delete(Administrador entity) {  
    }

    @Override
    public void deleteAll(Iterable<? extends Administrador> entities) {
    }

    @Override
    public void deleteAll() {
    }

    @Override
    public <S extends Administrador> Optional<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Administrador> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Administrador> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Administrador> boolean exists(Example<S> example) {
        return false;
    }
    
}
