package com.lemon.sibra.repository;

import com.lemon.sibra.model.Hotel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Long>{
    
}
