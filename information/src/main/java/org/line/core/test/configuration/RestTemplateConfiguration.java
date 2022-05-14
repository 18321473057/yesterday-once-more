package org.line.core.test.configuration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: yangcs
 * @Date: 2022/5/5 9:27
 * @Description:
 */
@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced  //默认轮训
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        RestTemplate build = builder.build();
        return build;
    }

}
