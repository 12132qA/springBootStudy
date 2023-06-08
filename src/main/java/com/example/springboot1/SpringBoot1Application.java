package com.example.springboot1;
import com.example.springboot1.contorller.contorl;
import com.example.springboot1.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

    public static void main(String[] args) {
        // 启动了spring容器
        ConfigurableApplicationContext run = SpringApplication.run(SpringBoot1Application.class, args);
        contorl bean = run.getBean(contorl.class);
        System.out.println("bean ========>>"+bean);
        User user = run.getBean(User.class);
        System.out.println(user);
    }


}
