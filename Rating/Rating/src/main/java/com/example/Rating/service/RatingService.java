package com.example.Rating.service;

import com.example.Rating.entity.Rating;

import java.util.List;

public interface RatingService {


    //Create
    Rating saveRating(Rating rating);

    //Get All Rating
    List<Rating> GetAllRating ();
    // Get All By UserId

List<Rating> GetAllUserById(String userId);


    //Get All By HotelId
List<Rating> GetAllHotelId(String hotelId);



}
