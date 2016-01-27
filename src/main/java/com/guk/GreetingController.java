package com.guk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public User greeting() {
        User currentUser= new User();
        currentUser.setEmail("kevin@hotmail.com");
        currentUser.setId(1);
        currentUser.setName("kevin");
        return currentUser;
    }


}