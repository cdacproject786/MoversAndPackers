package com.MoversAndPackersUsers.UsersModule.ExternalServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="DEMO-SERVICE")
public interface DemoInterface {

    @GetMapping("/demo")
    String demo();
}
