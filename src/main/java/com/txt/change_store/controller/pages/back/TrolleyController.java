package com.txt.change_store.controller.pages.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */
@Controller
@RequestMapping("/")
public class TrolleyController {

    @RequestMapping("/trolley")
    String trolley(){
        return "trolley";
    }
}
