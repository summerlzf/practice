package com.kedu.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liuzifeng
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
