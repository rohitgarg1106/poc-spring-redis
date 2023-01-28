package com.service.spring.pocspringredis.redis;

import com.service.spring.pocspringredis.common.CommonConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfiguration {

    @Value(CommonConstants.REDIS_HOST)
    private String redisHost;

    @Value(CommonConstants.REDIS_PORT)
    private Integer redisPort;

    @Value(CommonConstants.REDIS_PASSWORD)
    private String redisPassword;


    @Bean
    public RedisManager getRedisManager(){
        return new RedisManager(redisHost, redisPort, redisPassword);
    }
}
