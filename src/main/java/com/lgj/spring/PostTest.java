package com.lgj.spring;

import com.lgj.service.PostService;
import com.lgj.service.PostServiceImp;
import com.lgj.service.PostServiceImp2;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PostTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PostSpringConfig.class);
        PostService postService = applicationContext.getBean(PostServiceImp.class);
        postService.print();
    }
}
