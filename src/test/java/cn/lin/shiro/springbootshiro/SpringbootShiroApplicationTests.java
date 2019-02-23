package cn.lin.shiro.springbootshiro;

import cn.lin.shiro.springbootshiro.entity.Customer;
import cn.lin.shiro.springbootshiro.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootShiroApplicationTests {
    @Autowired
    private CustomerService customerService;

    @Test
    public void contextLoads() {
        Customer customer = customerService.getById(1);
    }

   /* @Test
    public void update(){

        Customer customer= new Customer(3,"qwe123456","qweww","e10adc3949ba59abbe56e057f20f883e","13412345632","qwe@163.com","1");
        customerService.updateById(customer);
    }*/

}
