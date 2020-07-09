package com.zcy;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @Author zhuangchongyi
 * @Description 服务端
 * @Date 2020/7/8 15:04
 */
@EnableDubbo//启用dubbo
@SpringBootApplication
public class ProviderApplicationRun {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplicationRun.class, args);
    }
}
