package com.example.springboot1.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class configYml {
    @Autowired
    private Environment env;

    public void testEvir(){
        System.out.println(env.getProperty("icon[0]"));
    }


}
