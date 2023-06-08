package com.example.springboot1;

import com.example.springboot1.Mapper.AirMapper;
import com.example.springboot1.config.MyDataSource;
import com.example.springboot1.config.configYml;
import com.example.springboot1.pojo.air;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;


import java.util.List;

@SpringBootTest// SpringBoot工程 提供引导类启动程序
class SpringBoot1ApplicationTests { // SpringBoot工程启动后创建并初始化Spring容器
    @Value("${icon[1]}")
    private String iocns;

    @Autowired
    private Environment env;

    @Autowired
    private configYml configYml;

    @Value("${tempDir}")
    private  String dirs;
    @Autowired
    private AirMapper airMapper;

    @Autowired
    private MyDataSource myDataSource;
    @Autowired
    private air use;
//    @Value("#{'${teacher.location.sign.time}'.split(',')}")
    @Value("#{'${teacher.location.sign.time.sport}'.split(',')}")
    private List<String> list;


    @Test
    void contextLoads() {
        System.out.println(iocns);
        System.out.println();
        System.out.println(dirs);

        // 配置
        for (String s : list) {
            System.out.println(s);
        }
        List<air> list = airMapper.list();
        list.forEach(System.out::println);
        airMapper.delete("19");
//        new AnnotationConfigApplicationContext(springConfig.class)
//        userMapper.insert();
//        User query = userMapper.query(23);
//        System.out.println(query);

        airMapper.update("air1988","56","mid","air1988");
    }
    @Test
    void test_Env(){

        configYml.testEvir();
        System.out.println(env.getProperty("server.port"));
        System.out.println(env.getProperty("icon[1]"));
        System.out.println(myDataSource);
    }

}
