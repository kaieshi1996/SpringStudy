import com.kuang.pojo.Host;
import com.kuang.pojo.Proxy;
import com.kuang.pojo.ProxyInvocationHandler;
import com.kuang.pojo.Rent;
import com.kuang.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test1(){
        new Proxy(new Host()).rent();
    }

    @Test
    public void test2(){
        Rent rent = new Host();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(rent);

        Rent proxy = (Rent)java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),pih);
        proxy.rent();
    }
    @Test
    public void test3(){

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.search();
    }

}
