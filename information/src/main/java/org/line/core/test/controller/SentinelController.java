package org.line.core.test.controller;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.line.core.resp.AjaxResponse;
import org.line.core.test.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangcs
 * @Date: 2022/5/16 15:04
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class SentinelController {

    @Autowired
    private FeignService feignService;

//    //编码
//    @RequestMapping("/sentinel")
//    @AjaxResponse
//    public String sentinel() {
//        Entry sentinel = null;
//        try {
//            sentinel = SphU.entry("sentinel");
//            return "!!--!!";
//        } catch (BlockException e) {
//            return " 被流控了";
//        } finally {
//            if (sentinel != null
//            ) {
//                sentinel.exit();
//            }
//        }
//    }
//
//    //注解
//    @RequestMapping("/sentinel1")
//    @AjaxResponse
//    @SentinelResource(value = "sentinel1", blockHandler = "doblockHandler")
//    public String sentinel1(@RequestParam String name) {
//            return "!!--!!"+name;
//    }
//
    public  String doblockHandler(String name,BlockException e) {
        return "--doblockHandler--"+name+e.getMessage();
    }



    //远程sentinel 配置
    @RequestMapping("/sentinel2")
    @AjaxResponse
    @SentinelResource(value = "sentinel2", blockHandler = "doblockHandler")
    public String sentinel2(@RequestParam String name) {
        return "!!-222-!!"+name;
    }



    //远程sentinel 配置
    @RequestMapping("/sentinel3")
    @AjaxResponse
    @SentinelResource(value = "sentinel3" )
    public String sentinel3(@RequestParam String name) throws InterruptedException {
        return "!!-333-!!"+name;
    }


    @RequestMapping("/sentinel4")
    @AjaxResponse
    public String sentinel4(@RequestParam String name) throws InterruptedException {
        return "!!-444-!!"+name;
    }

    @RequestMapping("/e")
    public String e(@RequestParam String name) {
       String m =  feignService.err();
       return m;
    }


//    @PostConstruct
//    private static void initFlowRules() {
//        List list = new ArrayList();
//        FlowRule rule = new FlowRule();
//        //资源名称
//        rule.setResource("sentinel");
//        //qps方式
//        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
//        //阈值
//        rule.setCount(1);
//        list.add(rule);
//
//        FlowRule rule2 = new FlowRule();
//        //资源名称
//        rule2.setResource("sentinel1");
//        //qps方式
//        rule2.setGrade(RuleConstant.FLOW_GRADE_QPS);
//        //阈值
//        rule2.setCount(1);
//        list.add(rule2);
//
//        //加载
//        FlowRuleManager.loadRules(list);
//
//    }
}
