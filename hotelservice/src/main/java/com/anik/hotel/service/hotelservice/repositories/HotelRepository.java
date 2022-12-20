package com.anik.hotel.service.hotelservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anik.hotel.service.hotelservice.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,String>{
    
}
