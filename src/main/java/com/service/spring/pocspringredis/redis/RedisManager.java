package com.service.spring.pocspringredis.redis;

import com.service.spring.pocspringredis.common.CommonUtils;
import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.api.StatefulRedisConnection;

public class RedisManager {

    private StatefulRedisConnection<String,String> connection;


    public RedisManager(String redisHost, Integer redisPort, String redisPassword) {
        RedisURI redisURI = RedisURI.builder().withHost(redisHost).withPort(redisPort).build();
        if(!CommonUtils.isStringEmpty(redisPassword)){
            redisURI.setPassword(redisPassword);
        }
        RedisClient client = RedisClient.create(redisURI);
        this.connection = client.connect();
    }


}
