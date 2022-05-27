package org.line.core.test.controller;

import org.line.core.domain.RemoteReqDto;
import org.line.core.resp.RemoteResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.HashMap;

/**
 * @Author: yangcs
 * @Date: 2022/5/4 9:25
 * @Description:
 */
@RestController
@RequestMapping("/test/cio")
public class CoreIoTestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/get")
    public String getmsg(String msg) {
        System.out.println(msg);
        return msg + ",,我接收到消息了"+port;
    }

    @PostMapping("/post")
    @RemoteResponse
    public HashMap post(@RequestBody RemoteReqDto dto) {
        System.out.println(dto);
        HashMap map = new HashMap();
        map.put("dd", "cc");
        map.put("vv", "ww");
        return map;
    }

    @GetMapping("/e")
    @RemoteResponse
    public void e() {
      int i= 0/0;
    }
}
