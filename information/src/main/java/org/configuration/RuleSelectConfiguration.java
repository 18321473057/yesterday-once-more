//package org.configuration;
//
//import com.netflix.loadbalancer.IRule;
//import com.netflix.loadbalancer.RandomRule;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Author: yangcs
// * @Date: 2022/5/14 9:23
// * @Description: 这个类不能放到componenScan 能扫描到的地方, 不然就会对所有的服务提供方生效;
// * 我们可以指定服务提供方的负载策略
// */
//
//@Configuration
//public class RuleSelectConfiguration {
//    //方法名 固定iRule
//    @Bean
//    public IRule iRule() {
//        return new RandomRule();
//    }
//}
