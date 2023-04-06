package com.MoversAndPackersUsers.UsersModule.ExternalServices;

import com.MoversAndPackersUsers.UsersModule.Model.ServiceProvider;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name= "PACKING-SERVICE")
public interface ServiceProviderInterface {

    @PostMapping("register")
    public ResponseEntity<?> registerUser(@RequestBody ServiceProvider serviceProvider);

    @GetMapping("AllServiceProvider")
    public ResponseEntity<?> getAllServProvider();


    @PostMapping("getCity/{city}")
    public ResponseEntity<?> getProvByCity(@PathVariable String city);

}
