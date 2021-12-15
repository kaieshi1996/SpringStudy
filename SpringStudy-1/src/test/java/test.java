import com.kuang.pojo.Hello;
import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import com.kuang.service.UserService;
import com.kuang.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.soap.SOAPBinding;

public class test {
    @Test
    public void test(){
        UserService service = new UserServiceImpl();
        service.getUser();
    }

    @Test
    public void test2(){
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //getBean : 参数即为spring配置文件中bean的id .
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("student");

        student.show();

    }

    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) context.getBean("user");

        System.out.println(user.name);
    }


}
