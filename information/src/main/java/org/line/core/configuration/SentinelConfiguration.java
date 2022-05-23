package org.line.core.configuration;

import org.line.core.sentinel.SentinelExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yangcs
 * @Date: 2022/5/23 18:55
 * @Description:
 */
@Configuration
public class SentinelConfiguration {

    @Bean
    public SentinelExceptionHandler sentinelExceptionHandler() {
        return new SentinelExceptionHandler();
    }

}
