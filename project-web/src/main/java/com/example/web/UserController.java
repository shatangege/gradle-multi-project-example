package com.example.web;

import com.example.business.UserService;
import com.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wjx on 15/7/5.
 */
@Controller
public class UserController {

    @RequestMapping("/user")
    public @ResponseBody String getUser(Model model) {
        UserService userService = new UserService();
        User user = userService.getUser();

        model.addAttribute("user", user);
        System.out.println("------------------------------------请求收到------------------");
        return user.getName();
    }
}
