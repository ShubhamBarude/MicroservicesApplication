package com.example.hotel.service;

import com.example.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {
    //Create User
    Hotel saveHotel(Hotel hotel);

    // Get All User
    List<Hotel> getAllHotel();

    //get Single User
    Hotel get(String hotelId);
}
