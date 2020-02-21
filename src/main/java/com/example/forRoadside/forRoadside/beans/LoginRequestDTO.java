package com.example.forRoadside.forRoadside.beans;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class LoginRequestDTO {
    private String userEmail;
    private String password;

}
