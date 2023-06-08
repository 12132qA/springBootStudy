import com.example.springboot1.SpringBoot1Application;
import com.example.springboot1.config.MyDataSource;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = SpringBoot1Application.class) // 加入引导类的class文件
//@RunWith() 设置运行器
//@ContextConfiguration 设置引导类放入spring的容器当中
//@ContextConfiguration(classes = SpringBoot1Application.class) 与 @SpringBootTest相同的作用
public class test_Out {
    @Autowired
    private MyDataSource myDataSource;
    @Test
    void test__(){
        System.out.println(myDataSource);
    }

}
