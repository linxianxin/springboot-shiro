package cn.lin.shiro.springbootshiro.service.impl;

import cn.lin.shiro.springbootshiro.entity.SysUser;
import cn.lin.shiro.springbootshiro.mapper.SysUserMapper;
import cn.lin.shiro.springbootshiro.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author laury
 * @since 2019-02-21
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public SysUser getUserByName(String username) {
        return baseMapper.getUserByName(username);
    }
}
