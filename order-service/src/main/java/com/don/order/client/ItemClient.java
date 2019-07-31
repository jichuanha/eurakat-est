package com.don.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jc
 * @Description:
 * @date 2019/7/31
 */

@Component
@FeignClient(name = "item-server") //name 为对应项目的 spring.application.name
public interface ItemClient {


    @RequestMapping("item/get_item")
    String getItem();

}
