package com.example.hotel.service;

import com.example.hotel.entity.Hotel;
import com.example.hotel.exception.ResourseNotFound;
import com.example.hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service

public class HotelImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel saveHotel(Hotel hotel) {
        String randomuserId=UUID.randomUUID().toString();
        hotel.setHotelId(randomuserId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(()->new ResourseNotFound("Resource is not found on server:"+hotelId));
    }
}
