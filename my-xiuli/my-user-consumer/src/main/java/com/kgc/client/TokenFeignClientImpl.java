package com.kgc.client;

import com.kgc.pojo.Users;
import org.springframework.stereotype.Component;

@Component
public class TokenFeignClientImpl implements TokenFeignClient{
    @Override
    public String generateToken(String userAgent, Users users) {
        return null;
    }

    @Override
    public void save(String token, Users user) {

    }

    @Override
    public Users getToken(String token) {
        return null;
    }
}
