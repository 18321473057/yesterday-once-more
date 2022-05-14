package org.line.core.test.service;

import org.line.core.domain.RemoteReqDto;
import org.line.core.domain.RemoteResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: yangcs
 * @Date: 2022/5/5 9:25
 * @Description:
 */
@Service
public class CoreWebReqTestService implements ICoreWebReqTestService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String sendRemoteMsg(String msg) {
        return restTemplate.getForObject("http://core-io/test/cio/get?msg=" + msg, String.class);
    }

    @Override
    public RemoteResponseDto sendRemotePost(RemoteReqDto<Object> reqDto) {
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        HttpEntity data = new HttpEntity(reqDto, headers);
        return restTemplate.postForObject("http://core-io/test/cio/post", data, RemoteResponseDto.class);
    }

}
