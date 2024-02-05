package com.example.hotel.hotelController;

import com.example.hotel.entity.Hotel;
import com.example.hotel.service.HotelService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

@PostMapping("/Create")
    //create
public ResponseEntity<Hotel> CreateHotel(@RequestBody Hotel hotel){
    Hotel hotel1=hotelService.saveHotel(hotel);
    return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
}


@GetMapping("/GetAll")
    //getAllUser
public ResponseEntity<List<Hotel>> getAllHotel(){
    List<Hotel> AllUser=hotelService.getAllHotel();
    return ResponseEntity.ok().body(AllUser);
}

@GetMapping("/{hotelId}/get")
    //getSingleUser
public ResponseEntity<Hotel> get(@PathVariable String hotelId){

    Hotel hotel=hotelService.get(hotelId);
    return ResponseEntity.ok(hotel);
}



}
