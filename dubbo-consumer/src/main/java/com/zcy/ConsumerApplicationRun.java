package com.zcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @Author zhuangchongyi
 * @Description dubbo消费端
 * @Date 2020/7/8 12:49
 */
//@EnableDubbo //启用dubbo

@SpringBootApplication
public class ConsumerApplicationRun {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplicationRun.class, args);
    }
}
