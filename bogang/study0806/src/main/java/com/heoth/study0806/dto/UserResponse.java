package com.heoth.study0806.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserResponse {
    private Long id;
    private String userID;
    private String userPW;
    private String userEmail;


}
