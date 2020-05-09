package com.txt.change_store.controller.pages.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */
@Controller
@RequestMapping("/")
public class AllowGoodsController {

    @RequestMapping("/allow-goods")
    String allowGoods(){
        return "allow-goods";
    }
}
