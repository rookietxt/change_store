package com.txt.change_store.controller.pages.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */
@Controller
@RequestMapping("/")
public class Index2Controller {

    @RequestMapping("/index2")
    String history(){
        return "index2";
    }
}
