package com.lgj.config;

import com.lgj.service.PostServiceImp;
import com.lgj.service.PostServiceImp2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringServiceConfig {

    @Bean
    public PostServiceImp getPostService(){
        return new PostServiceImp();
    }

    @Bean
    public PostServiceImp2 getPostService2(){
        return new PostServiceImp2();
    }
}
