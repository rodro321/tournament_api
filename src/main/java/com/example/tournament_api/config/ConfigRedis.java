package com.example.tournament_api.config;

import org.springframework.boot.cache.autoconfigure.RedisCacheManagerBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;

import java.time.Duration;

@Configuration
public class ConfigRedis {
    @Bean
    RedisCacheManagerBuilderCustomizer customizer() {
        return builder -> builder.withCacheConfiguration(
                "teams",
                RedisCacheConfiguration.defaultCacheConfig()
                        .entryTtl(Duration.ofMinutes(5))
        );
    }

}
