package com.example.UserService.repositry;

import com.example.UserService.entity.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import javax.persistence.Entity;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    //if you want to implement any custom method or query
    //write
}
