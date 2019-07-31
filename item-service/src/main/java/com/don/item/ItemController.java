package com.don.item;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jc
 * @Description:
 * @date 2019/7/31
 */
@RestController
@RequestMapping("/item")
public class ItemController {


    @RequestMapping("/get_item")
    public String getItem() {
        return "你真的是太好了!!";
    }

    @RequestMapping("/list_item")
    public String listItem() {
        return "hahahahahaha";
    }

}
