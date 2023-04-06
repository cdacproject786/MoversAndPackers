package com.MoversAndPackersUsers.UsersModule.Service;

import com.MoversAndPackersUsers.UsersModule.Model.Users;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    String addUser(Users user);
    List<Users> selectAll();

    ResponseEntity<?> getAllProviders();

    ResponseEntity<?> findNearby(String city);
}

