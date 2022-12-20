package com.anik.hotel.service.hotelservice.services;

import java.util.List;

import com.anik.hotel.service.hotelservice.entities.Hotel;

public interface HotelService {
    
    //create 
    Hotel create(Hotel hotel);

    //getall 
    List<Hotel> getLAll();

    //get single
    Hotel get(String id);

}
