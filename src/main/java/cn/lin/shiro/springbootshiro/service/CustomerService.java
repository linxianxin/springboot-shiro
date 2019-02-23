package cn.lin.shiro.springbootshiro.service;

import cn.lin.shiro.springbootshiro.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author laury
 * @since 2019-02-21
 */
public interface CustomerService extends IService<Customer> {
    /**
     * 查询所有会员信息
     * @return
     */
    List<Customer> getAllCustomer();
}
