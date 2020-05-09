package com.txt.change_store.controller.pages.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */
@Controller
@RequestMapping("/")
public class StoreController {

    @RequestMapping("/index")
    String Store(){
        return "index2";
    }
}
