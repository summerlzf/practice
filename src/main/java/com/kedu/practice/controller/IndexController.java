package com.kedu.practice.controller;

import com.kedu.practice.entity.UserInfo;
import com.kedu.practice.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liuzifeng
 */
@Controller
public class IndexController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/index")
    public String index(Model model) {
        UserInfo user = userInfoService.getById(3);
        model.addAttribute("user", user);
        return "index";
    }
}
