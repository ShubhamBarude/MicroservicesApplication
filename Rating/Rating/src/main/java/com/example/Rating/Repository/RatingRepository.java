package com.example.Rating.Repository;

import com.example.Rating.entity.Rating;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository <Rating,String> {
    List<Rating> getByUserId(String userId);
    List <Rating> getByHotelId(String hotelId);
}

