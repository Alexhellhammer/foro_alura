package com.proyectAlex.Challenge_Foro_Alura.models;

public class AuthResponse {
    private String token;
    private Long expiration;

    public AuthResponse(String token, Long expiration) {
        this.token = token;
        this.expiration = expiration;
    }

    public String getToken() {
        return token;
    }

    public Long getExpiration() {
        return expiration;
    }
}
