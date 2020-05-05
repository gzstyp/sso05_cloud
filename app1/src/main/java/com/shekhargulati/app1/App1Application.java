package com.shekhargulati.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//必须先启动认证服务器端或资源服务器才不报错
@SpringBootApplication
@EnableOAuth2Sso
public class App1Application extends WebMvcConfigurerAdapter {

    // http://localhost:8082/app1
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }

    public static void main(String[] args) {
        SpringApplication.run(App1Application.class,args);
    }
}