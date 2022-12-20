package com.anik.rating.service.ratingservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anik.rating.service.ratingservice.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating,String> {
    

    //custom methods

    List<Rating>findByUserId(String userId);

    List<Rating>findByHotelId(String hotelId);
    
}
