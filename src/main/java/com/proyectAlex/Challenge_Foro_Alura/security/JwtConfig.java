package com.proyectAlex.Challenge_Foro_Alura.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;

    @Bean
    public String jwtSecret() {
        return secret;
    }

    @Bean
    public Long jwtExpiration() {
        return expiration;
    }
}
