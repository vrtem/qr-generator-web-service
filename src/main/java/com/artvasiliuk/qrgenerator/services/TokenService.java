package com.artvasiliuk.qrgenerator.services;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    private int tokenLength = 7;

    public String createToken() {
        return RandomStringUtils.randomAlphanumeric(tokenLength).toUpperCase();
    }

    public boolean validateToken(String token) {
        return true;
    }
}
