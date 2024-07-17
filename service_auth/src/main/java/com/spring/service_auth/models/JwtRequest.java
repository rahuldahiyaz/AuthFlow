package com.spring.service_auth.models;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class JwtRequest {
    private String email;
    private String password;
}
