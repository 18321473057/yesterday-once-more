package org.line.core.feign.interceptor;

import ch.qos.logback.classic.Logger;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.java.Log;

/**
 * @Author: yangcs
 * @Date: 2022/5/16 14:14
 * @Description:
 */
@Log
public class LogFeignInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("token_type","ycs");
        log.info("fegin拦截器生效!!!");
    }
}
