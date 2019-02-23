package cn.lin.shiro.springbootshiro.service.impl;

import cn.lin.shiro.springbootshiro.entity.Customer;
import cn.lin.shiro.springbootshiro.mapper.CustomerMapper;
import cn.lin.shiro.springbootshiro.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author laury
 * @since 2019-02-21
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {


    @Override
    public List<Customer> getAllCustomer() {
        return baseMapper.getAllCustomer();
    }
}
