package org.line.core.test.controller;

import com.github.pagehelper.Page;
import org.line.core.domain.RemoteReqDto;
import org.line.core.domain.RemoteResponseDto;
import org.line.core.exception.BusinessException;
import org.line.core.exception.RemoteBusinessException;
import org.line.core.resp.AjaxResponse;
import org.line.core.resp.PageResponse;
import org.line.core.resp.RemoteResponse;
import org.line.core.test.feign.FeignService;
import org.line.core.test.po.ValidPo;
import org.line.core.test.service.ICoreWebReqTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: yangcs
 * @Date: 2022/5/4 9:25
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class CoreWebReqTestController {

    @Autowired
    private FeignService feignService;

    @Autowired
    private ICoreWebReqTestService coreWebReqTestService;

    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    @AjaxResponse
    public void add(@RequestBody RemoteReqDto b) {
        System.out.println(b);
    }

    @GetMapping("/get/{id}")
    @AjaxResponse
    public HashMap get(@PathVariable String id) {
        HashMap<Object, Object> hashMap = new HashMap();
        hashMap.put("id", id);
        hashMap.put("name", "杨传顺");
        hashMap.put("age", "30");
        return hashMap;
    }

    @GetMapping("/get/{id}/e")
    @AjaxResponse
    public HashMap gete(@PathVariable String id) {
        throw new BusinessException("我错为了");
    }


    @GetMapping("/page")
    @PageResponse
    public Page page() {
        HashMap<Object, Object> hashMap1 = new HashMap();
        hashMap1.put("id", "id");
        hashMap1.put("name", "啊大");
        hashMap1.put("age", "31");
        HashMap<Object, Object> hashMap2 = new HashMap();
        hashMap2.put("id", "id");
        hashMap2.put("name", "阿二");
        hashMap2.put("age", "33");
        HashMap<Object, Object> hashMap3 = new HashMap();
        hashMap3.put("id", "id");
        hashMap3.put("name", "阿三");
        hashMap3.put("age", "33");

        ArrayList arrayList = new ArrayList();
        arrayList.add(hashMap1);
        arrayList.add(hashMap2);
        arrayList.add(hashMap3);
        Page<Object> objects = new Page();
        objects.addAll(arrayList);
        objects.setTotal(208L);
        return objects;
    }

    @GetMapping("/remote/get")
    @RemoteResponse
    public HashMap rget(RemoteReqDto<HashMap> dto) {
        HashMap<Object, Object> hashMap = new HashMap();
        hashMap.put("id", "id");
        hashMap.put("name", "杨传顺");
        hashMap.put("age", "30");
        hashMap.put("说明", "我是模拟远程接口");
        return hashMap;
    }


    @GetMapping("/remote/get/e")
    @RemoteResponse
    public String rgete(RemoteReqDto<HashMap> dto) {
        throw new RemoteBusinessException("我错为了");
    }

    @GetMapping("/foo")
    public HashMap getfoo() {
        HashMap<Object, Object> hashMap = new HashMap();
        hashMap.put("id", "id");
        hashMap.put("name", "杨传顺");
        hashMap.put("age", "30");
        return hashMap;
    }


    @GetMapping("/rest/get")
    @RemoteResponse
    public String restget(@RequestParam String name) {
//        String msg = coreWebReqTestService.sendRemoteMsg("我来了");
        String msg = feignService.sendRemoteMsg("我来了");
        return msg;
    }

    @PostMapping("/rest/post")
    @RemoteResponse
    public Object restpost(@RequestBody RemoteReqDto dto) {
//        RemoteResponseDto msg = coreWebReqTestService.sendRemotePost(dto);
        RemoteResponseDto msg = feignService.sendRemotePost(dto);
        return msg.getResult();
    }


    @PostMapping("/cc")
    @ResponseBody
    public Object cc(@RequestBody @Valid ValidPo dto) {
        throw new BusinessException("");
    }


}
