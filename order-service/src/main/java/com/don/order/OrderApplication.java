package com.don.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author jc
 * @Description:
 * @date 2019/7/31
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@Slf4j
public class OrderApplication {

    public static void main(String[] args) {
        log.info("order 启动中 --- ");
        SpringApplication.run(OrderApplication.class, args);
        log.info("order 启动成功 --- ");
    }
}
