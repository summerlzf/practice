package com.kedu.practice.controller;

import com.kedu.practice.service.FutureCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuzifeng
 */
@RequestMapping("/future")
@RestController
public class FutureCaseController {

    @Autowired
    private FutureCaseService futureCaseService;

    @GetMapping("/test")
    public String test() {
        return "";
    }
}
