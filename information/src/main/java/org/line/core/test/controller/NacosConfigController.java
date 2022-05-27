package org.line.core.test.controller;

import org.line.core.resp.AjaxResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yangcs
 * @Date: 2022/5/16 15:04
 * @Description:
 */
@RestController
@RequestMapping("/test")
@RefreshScope  //动态感知配置文件修改
public class NacosConfigController {


    @Value("${uu}")
    private String pp;


    @RequestMapping("/config")
    @AjaxResponse
    public String cong() {
        return pp;
    }
}
