package com.example.Rating.controller;

import com.example.Rating.entity.Rating;
import com.example.Rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    private RatingService ratingService;
    @PostMapping("/api")
    public ResponseEntity<Rating> create(@RequestBody Rating rating){
       //Rating rating1=ratingService.saveRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.saveRating(rating));
    }
    @GetMapping("/getAllRating")
    public ResponseEntity<List<Rating>> getAllRating(){
        List<Rating> rating=ratingService.GetAllRating();
        return ResponseEntity.ok(rating);

    }
    @GetMapping("/user/{userId}")
    public  ResponseEntity<List<Rating>> getbyuserId(@PathVariable String userId){
        List<Rating> ratings=ratingService.GetAllUserById(userId);
        return ResponseEntity.ok(ratings);
    }
    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getbyHotelid(@PathVariable String hotelId){
        List<Rating> ratings=ratingService.GetAllHotelId(hotelId);
        return  ResponseEntity.ok(ratings);

    }
}
