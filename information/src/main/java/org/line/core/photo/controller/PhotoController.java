package org.line.core.photo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executors;

/**
 * @Author: yangcs
 * @Date: 2022/5/4 9:25
 * @Description:
 */
@RestController
@RequestMapping("/photo") 
public class PhotoController {


    String str = "[{\"aedat\":\"-00-00\",\"andat\":\"2017-05-24\",\"annam\":\"NYPP102\",\"bmeng\":\"1.000\",\"datuv\":\"2016-07-01\",\"idnrk\":\"334900412\",\"maktx\":\"成品电池/锂离子电池/48V10Ah小牛(天能20P电芯-客供保护板)\",\"matnr\":\"163300198\",\"meins\":\"SET\",\"menge\":\"4.000\",\"posnr\":\"120\",\"postp\":\"L\",\"sanfe\":\"X\",\"sanka\":\"X\",\"stlal\":\"1\",\"stlan\":\"1\",\"stlnr\":\"52725\",\"stlst\":\"1\",\"werks\":\"1310\"}," +
            "{\"aedat\":\"-00-00\",\"andat\":\"2017-05-24\",\"annam\":\"NYPP102\",\"bmeng\":\"1.000\",\"datuv\":\"2016-07-01\",\"idnrk\":\"334900451\",\"maktx\":\"成品电池/锂离子电池/48V10Ah小牛(天能20P电芯-客供保护板)\",\"matnr\":\"163300198\",\"meins\":\"ST\",\"menge\":\"4.000\",\"posnr\":\"130\",\"postp\":\"L\",\"sanfe\":\"X\",\"sanka\":\"X\",\"stlal\":\"1\",\"stlan\":\"1\",\"stlnr\":\"52725\",\"stlst\":\"1\",\"werks\":\"1310\"}," +
            "{\"aedat\":\"-00-00\",\"andat\":\"2017-05-24\",\"annam\":\"NYPP102\",\"bmeng\":\"1.000\",\"datuv\":\"2016-07-01\",\"idnrk\":\"334900153\",\"maktx\":\"成品电池/锂离子电池/48V10Ah小牛(天能20P电芯-客供保护板)\",\"matnr\":\"163300198\",\"meins\":\"ST\",\"menge\":\"12.000\",\"posnr\":\"140\",\"postp\":\"L\",\"sanfe\":\"X\",\"sanka\":\"X\",\"stlal\":\"1\",\"stlan\":\"1\",\"stlnr\":\"52725\",\"stlst\":\"1\",\"werks\":\"1310\"}," +
            "{\"aedat\":\"-00-00\",\"andat\":\"2017-05-24\",\"annam\":\"NYPP102\",\"bmeng\":\"1.000\",\"datuv\":\"2016-07-01\",\"idnrk\":\"332000529\",\"maktx\":\"成品电池/锂离子电池/48V10Ah小牛(天能20P电芯-客供保护板)\",\"matnr\":\"163300198\",\"meins\":\"ST\",\"menge\":\"2.000\",\"posnr\":\"180\",\"postp\":\"L\",\"sanfe\":\"X\",\"sanka\":\"X\",\"stlal\":\"1\",\"stlan\":\"1\",\"stlnr\":\"52725\",\"stlst\":\"1\",\"werks\":\"1310\"}]";

    public static void main(String[] args) {
        Executors.newCachedThreadPool();
        JSONObject.parseArray("jsonStr", String.class);
    }
}
