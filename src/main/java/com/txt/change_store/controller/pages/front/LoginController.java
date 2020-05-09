package com.txt.change_store.controller.pages.front;

import com.txt.change_store.pojo.Entity.StoreUser;
import com.txt.change_store.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 这个类是一个登陆的控制器。完成登陆检验操作等功能
 */
@Controller
    @RequestMapping("/pages/front")
    public class LoginController {
    @Resource
    UserService userService;
    @RequestMapping("loginPage")
    String loginPage(){
            return "pages/front/login/loginPage.html";
    }

/**
 *验证用户名密码登陆操作的方法
 */
    @RequestMapping("login")
    String login(StoreUser user, Model model){
        if("".equals(user.getMobilePhone())||user.getMobilePhone()==null){//手机为空，直接登陆失败
            model.addAttribute("errorMsg","请输入正确的手机号！");
            return "pages/front/login/loginPage";
        }
        boolean loginResult = userService.login(user);
        if(loginResult){   //登陆成功返回到后台首页

            return "personal2";
        }
        model.addAttribute("errorMsg","登陆失败，手机号或密码错误!");

        return "pages/front/login/loginPage.html";
    }
}
