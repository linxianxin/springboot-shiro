package cn.lin.shiro.springbootshiro.controller;


import cn.lin.shiro.springbootshiro.entity.Customer;
import cn.lin.shiro.springbootshiro.service.CustomerService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 会员表 前端控制器
 * </p>
 *
 * @author laury
 * @since 2019-02-21
 */
@Controller

public class CustomerController {
    @Autowired
    private CustomerService customerService;


    /**
     * 会员列表
     * @param model
     * @return
     */
    @RequestMapping("customer")
    @RequiresPermissions("customer")
    public String toCustomer(Model model){
        List<Customer> customers = customerService.getAllCustomer();
        model.addAttribute("customers",customers);
        return "customer";
    }

    /**
     * 分页查询
     *
     */
   /* @RequestMapping
    public IPage<Customer> findByPage(int pageNo , int pageSize) {
        Page<Customer> page = new Page<>(pageNo,pageSize);
        return customerService.page();
    }*/



    /**
     * 进行添加操作
     * @param customer
     * @return
     */
    @RequestMapping("doadd")
    public String doadd(Customer customer){
        Md5Hash md5Hash=new Md5Hash(customer.getPassword());
        customer.setPassword(md5Hash.toString());
        customerService.save(customer);
        return "redirect:customer";
    }


    /**
     * 进行修改操作
     * @param customer
     * @return
     */
    @RequestMapping("doupdate")
    public String doupdate(Customer customer){
        customerService.updateById(customer);
        return "redirect:customer";
    }


    /**
     * 进行删除操作
     * @param id
     * @return
     */
    @RequestMapping("delete")
    @RequiresPermissions("customer:delete")
    public String delete(Integer id){
        customerService.removeById(id);
        return "redirect:customer";
    }

}
