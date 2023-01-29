package com.service.spring.pocspringredis.service;

import com.service.spring.pocspringredis.redis.RedisManager;
import com.service.spring.pocspringredis.request.SetRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RedisService {
    @Autowired
    private RedisManager redisManager;

    public String getKey(String key){
        return redisManager.getKey(key);
    }

    public void setKeyWithExpiry(SetRequest request) {
        redisManager.setKeyWithExpiry(request.getKey(), request.getValue(), request.getTtl());
    }
}
