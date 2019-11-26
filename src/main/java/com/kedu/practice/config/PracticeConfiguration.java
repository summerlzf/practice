package com.kedu.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author liuzifeng
 * @date 2019/11/27
 */
public class PracticeConfiguration {

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfig();
    }
}
