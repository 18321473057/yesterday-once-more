package org.line.core.test.feign;

import org.line.core.domain.RemoteReqDto;
import org.line.core.domain.RemoteResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: yangcs
 * @Date: 2022/5/14 16:27
 * @Description:
 */
@FeignClient(name = "core-io", path = "/test")
public interface FeignService {
    @GetMapping("/cio/get")
    String sendRemoteMsg(@RequestParam String msg);
    @GetMapping("/cio/post")
    RemoteResponseDto sendRemotePost(@RequestBody RemoteReqDto<Object> reqDto);
}
