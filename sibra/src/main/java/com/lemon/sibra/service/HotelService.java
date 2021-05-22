package com.lemon.sibra.service;

import java.util.List;
import java.util.Optional;

import com.lemon.sibra.model.Hotel;
import com.lemon.sibra.repository.HotelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class HotelService implements HotelRepository{

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    @Override
    public List<Hotel> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<Hotel> findAllById(Iterable<Long> ids) {
        return null;
    }

    @Override
    public <S extends Hotel> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() { 
    }

    @Override
    public <S extends Hotel> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Hotel> entities) {  
    }

    @Override
    public void deleteAllInBatch() { 
    }

    @Override
    public Hotel getOne(Long id) {
        return null;
    }

    @Override
    public <S extends Hotel> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Hotel> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public Page<Hotel> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Hotel> S save(S entity) {
        return null;
    }

    @Override
    public Optional<Hotel> findById(Long id) {
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
    public void delete(Hotel entity) {  
    }

    @Override
    public void deleteAll(Iterable<? extends Hotel> entities) {
    }

    @Override
    public void deleteAll() {  
    }

    @Override
    public <S extends Hotel> Optional<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Hotel> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Hotel> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Hotel> boolean exists(Example<S> example) {
        return false;
    }
    
}
