package com.don.order;

import com.don.order.client.ItemClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jc
 * @Description:
 * @date 2019/7/31
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private ItemClient itemClient;

    @GetMapping("/get_item")
    public String getItem() {

        String item = itemClient.getItem();
        log.info("item +++:{}", item);
        return item;
    }


    @GetMapping("/list_item")
    public String listItem() {

        String item = itemClient.listItem();
        log.info("item +++:{}", item);
        return item;
    }
}
