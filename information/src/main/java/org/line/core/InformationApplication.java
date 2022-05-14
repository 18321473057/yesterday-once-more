package org.line.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//scanBasePackages="com.line" 自动装配代码 只需要被包扫描到
//他妈的 设置之后就没有默认的扫描了,自己启动的这个项目也要被扫描到!!!!! com.line 可以扫描到所有组件
@SpringBootApplication
@ComponentScan(basePackages = {"org.line"})
//@RibbonClients(value = {@RibbonClient(name = "core-io",configuration = RuleSelectConfiguration.class)})
public class InformationApplication {
    public static void main(String[] args) {
        SpringApplication.run(InformationApplication.class, args);
    }
}
