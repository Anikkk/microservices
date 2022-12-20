package com.anik.rating.service.ratingservice.services;

import java.util.List;
import com.anik.rating.service.ratingservice.entities.Rating;

public interface RatingService {
   
    //create
    Rating create(Rating rating);

    //get all ratings
    List<Rating> getRatings();

    //get all by userid 
    List<Rating> getRatingByUserId(String userId);

    //get all by hotelid
    List<Rating> getRatingByHotelId(String hotelId);
}
