package com.shekhargulati.app2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//必须先启动认证服务器端或资源服务器才不报错
@SpringBootApplication
@EnableOAuth2Sso
public class App2Application extends WebMvcConfigurerAdapter {

    // http://localhost:8083/app2
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }

    public static void main(String[] args) {
        SpringApplication.run(App2Application.class, args);
    }
}