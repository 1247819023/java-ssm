package com.lgj.spring;

import com.lgj.entity.PAuthor;
import com.lgj.service.PostServiceImp;
import com.lgj.service.PostServiceImp2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class PostSpringConfig {

    @Bean
    public PostServiceImp postServiceImp(){
        return new PostServiceImp();
    }

    @Bean
    public PostServiceImp2 postServiceImp2(){
        return new PostServiceImp2();
    }
}
