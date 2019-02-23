package cn.lin.shiro.springbootshiro.mapper;

import cn.lin.shiro.springbootshiro.entity.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 会员表 Mapper 接口
 * </p>
 *
 * @author laury
 * @since 2019-02-21
 */
public interface CustomerMapper extends BaseMapper<Customer> {
    /**
     * 查询所有会员信息
     * @return
     */
    List<Customer> getAllCustomer();


}
