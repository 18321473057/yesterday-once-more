package org.line.core.test.feign;

import org.line.core.domain.RemoteReqDto;
import org.line.core.domain.RemoteResponseDto;
import org.line.core.feign.FeignSentinelServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: yangcs
 * @Date: 2022/5/14 16:27
 * @Description:
 */
@Component
public class FeignServiceFallBack implements FeignService{


    @Override
    public String sendRemoteMsg(String msg) {
        return "sendRemoteMsg 发生异常"+msg;
    }

    @Override
    public RemoteResponseDto sendRemotePost(RemoteReqDto<Object> reqDto) {
        return new  RemoteResponseDto();
    }

    @Override
    public String err() {
        System.out.println("--------------------------------------- err接口测试");
        return "feign-sentinel 异常整合 接口测试";
    }
}
