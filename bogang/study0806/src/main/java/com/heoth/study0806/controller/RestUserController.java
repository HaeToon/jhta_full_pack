package com.heoth.study0806.controller;

import com.heoth.study0806.dto.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestUserController {
    Long id;

    @GetMapping("/user")
    public UserResponse info(){
        UserResponse userResponse = UserResponse.builder()
                .id(++id)
                .userID("1234")
                .userPW("1234")
                .userEmail("1234@1234")
                .build();
        return  userResponse;
    }
}
