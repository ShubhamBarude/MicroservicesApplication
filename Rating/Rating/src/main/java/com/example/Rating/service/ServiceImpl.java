package com.example.Rating.service;

import com.example.Rating.Repository.RatingRepository;
import com.example.Rating.entity.Rating;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class ServiceImpl implements RatingService{
    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public Rating saveRating(Rating rating) {
//       int randomId= UUID.randomUUID().toString();
//        rating.setRatingId(randomId);

        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> GetAllRating() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> GetAllUserById(String userId) {
        return ratingRepository.getByUserId(userId);
    }

    @Override
    public List<Rating> GetAllHotelId(String hotelId) {
        return ratingRepository.getByHotelId(hotelId);
    }
}
