package com.example.UserService.service.impl;


import com.example.UserService.entity.User;
import com.example.UserService.exception.ResourceNotFoundException;
import com.example.UserService.repositry.UserRepository;
import com.example.UserService.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;
    private Logger logger= LoggerFactory.getLogger(UserService.class);
    public User saveUser(User user) {
        //generate  unique userid
        String randomuserId=UUID.randomUUID().toString();
        user.setUserId(randomuserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {

        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        //get user from database with the help  of user repository

        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server !! : " + userId));
       ArrayList forObject=restTemplate.getForObject("http://localhost:8765/rating/user/bd174813-aa06-4dc6-8d7a-235c6d8e6c91", ArrayList.class);
  logger.info("{}",forObject);
        return user;
    }
}

