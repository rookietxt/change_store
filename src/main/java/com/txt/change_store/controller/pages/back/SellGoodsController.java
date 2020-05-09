package com.txt.change_store.controller.pages.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */
@Controller
@RequestMapping("/")
public class SellGoodsController {

    @RequestMapping("/sell-goods")
    String sellGoods(){
        return "sell-goods";
    }
}
