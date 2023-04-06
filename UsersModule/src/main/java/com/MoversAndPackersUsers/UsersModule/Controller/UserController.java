package com.MoversAndPackersUsers.UsersModule.Controller;

import com.MoversAndPackersUsers.UsersModule.ExternalServices.DemoInterface;
import com.MoversAndPackersUsers.UsersModule.Model.Users;
import com.MoversAndPackersUsers.UsersModule.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userServ;

    @PostMapping("/register")
    public String add(@RequestBody Users user){

        userServ.addUser(user);

        return "Seccess";

    }

    @GetMapping("/getAllUsers")
    public List<Users> getAll()
    {
        return userServ.selectAll();
    }


    @GetMapping("AllServiceProvider")
    public ResponseEntity<?> getAllProvider()
    {
        return userServ.getAllProviders();
    }

    @Autowired
    private DemoInterface demoInterface;

    @GetMapping("/demo")
    public String demo()
    {
        return demoInterface.demo();
    }

    @PostMapping("nearbyServices/{city}")
    public ResponseEntity<?> getNearbyServices(@PathVariable String city)
    {
        return userServ.findNearby(city);
    }
}
