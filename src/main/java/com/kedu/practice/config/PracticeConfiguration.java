package com.kedu.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.*;

/**
 * @author liuzifeng
 * @date 2019/11/27
 */
public class PracticeConfiguration {

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfig();
    }

    @Bean
    public ExecutorService executorService() {
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(100);
        return new ThreadPoolExecutor(10, 50, 10, TimeUnit.SECONDS,
                queue, Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
    }
}
