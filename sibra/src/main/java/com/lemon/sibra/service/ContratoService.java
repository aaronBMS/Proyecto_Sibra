package com.lemon.sibra.service;

import java.util.List;
import java.util.Optional;

import com.lemon.sibra.model.Contrato;
import com.lemon.sibra.repository.ContratoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ContratoService implements ContratoRepository{

    @Autowired
    private ContratoRepository contratoRepository;

    @Override
    public List<Contrato> findAll() {
        return contratoRepository.findAll();
    }

    @Override
    public List<Contrato> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<Contrato> findAllById(Iterable<Long> ids) {
        return null;
    }

    @Override
    public <S extends Contrato> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() { 
    }

    @Override
    public <S extends Contrato> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Contrato> entities) {  
    }

    @Override
    public void deleteAllInBatch() {
    }

    @Override
    public Contrato getOne(Long id) {
        return null;
    }

    @Override
    public <S extends Contrato> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Contrato> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public Page<Contrato> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Contrato> S save(S entity) {
        return null;
    }

    @Override
    public Optional<Contrato> findById(Long id) {
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
    public void delete(Contrato entity) {
    }

    @Override
    public void deleteAll(Iterable<? extends Contrato> entities) {  
    }

    @Override
    public void deleteAll() { 
    }

    @Override
    public <S extends Contrato> Optional<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Contrato> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Contrato> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Contrato> boolean exists(Example<S> example) {
        return false;
    }
    
}
