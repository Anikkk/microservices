package com.anik.hotel.service.hotelservice.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anik.hotel.service.hotelservice.entities.Hotel;
import com.anik.hotel.service.hotelservice.exception.ResourceNotFoundException;
import com.anik.hotel.service.hotelservice.repositories.HotelRepository;
import com.anik.hotel.service.hotelservice.services.HotelService;


@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelid=UUID.randomUUID().toString();
        hotel.setId(hotelid);
        return hotelRepository.save(hotel);
    }

    @Override 
    public List<Hotel> getLAll() {    
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {      
        return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("hotel with given id not found"));
    }
    
}
