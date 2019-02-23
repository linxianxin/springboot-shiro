package cn.lin.shiro.springbootshiro.mapper;

import cn.lin.shiro.springbootshiro.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author laury
 * @since 2019-02-21
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    SysUser getUserByName(String username);

}
