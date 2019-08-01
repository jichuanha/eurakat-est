package com.don.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author jc
 * @Description:
 * @date 2019/7/31
 */
@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaService2 {

    public static void main(String[] args) {
        log.info("EurekaService 开始启动 -------");
        SpringApplication.run(EurekaService2.class, args);
        log.info("EurekaService 启动成功 -------");
    }
}
