package com.lemon.sibra.service;

import java.util.List;
import java.util.Optional;

import com.lemon.sibra.model.Cliente;
import com.lemon.sibra.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements ClienteRepository{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<Cliente> findAllById(Iterable<Long> ids) {
        return null;
    }

    @Override
    public <S extends Cliente> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() {   
    }

    @Override
    public <S extends Cliente> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Cliente> entities) {
    }

    @Override
    public void deleteAllInBatch() {
    }

    @Override
    public Cliente getOne(Long id) {
        return null;
    }

    @Override
    public <S extends Cliente> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Cliente> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public Page<Cliente> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Cliente> S save(S entity) {
        return null;
    }

    @Override
    public Optional<Cliente> findById(Long id) {
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
    public void delete(Cliente entity) {
    }

    @Override
    public void deleteAll(Iterable<? extends Cliente> entities) { 
    }

    @Override
    public void deleteAll() {  
    }

    @Override
    public <S extends Cliente> Optional<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Cliente> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Cliente> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Cliente> boolean exists(Example<S> example) {
        return false;
    }
    
}
