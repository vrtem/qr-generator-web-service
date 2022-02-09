package com.artvasiliuk.qrgenerator.services;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TokenService {

    private int tokenLength = 7;
    private List<String> tokenList;

    public String createToken() {
        String token = RandomStringUtils.randomAlphanumeric(tokenLength).toUpperCase();
        tokenList.add(token);
        return token;
    }

    public boolean validateToken(String token) {
        if (tokenList.contains(token)) {
            return true;
        } else {
            return false;
        }
    }
}
