package org.line.core.test.service;

import org.line.core.domain.RemoteReqDto;
import org.line.core.domain.RemoteResponseDto;

import java.util.HashMap;

/**
 * @Author: yangcs
 * @Date: 2022/5/5 9:25
 * @Description:
 */
public interface ICoreWebReqTestService {
    String sendRemoteMsg(String msg);

    RemoteResponseDto sendRemotePost(RemoteReqDto<Object> reqDto);
}
