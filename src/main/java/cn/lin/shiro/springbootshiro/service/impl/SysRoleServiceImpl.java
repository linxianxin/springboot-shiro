package cn.lin.shiro.springbootshiro.service.impl;

import cn.lin.shiro.springbootshiro.entity.SysRole;
import cn.lin.shiro.springbootshiro.mapper.SysRoleMapper;
import cn.lin.shiro.springbootshiro.service.SysRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author laury
 * @since 2019-02-21
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Override
    public List<SysRole> getRoleById(Integer userId) {
        return baseMapper.getRoleById(userId);
    }
}
