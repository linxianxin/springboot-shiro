package cn.lin.shiro.springbootshiro.service.impl;

import cn.lin.shiro.springbootshiro.entity.SysPermission;
import cn.lin.shiro.springbootshiro.mapper.SysPermissionMapper;
import cn.lin.shiro.springbootshiro.service.SysPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author laury
 * @since 2019-02-21
 */
@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements SysPermissionService {

    @Override
    public List<SysPermission> getSysPermissionById(Integer id) {
        return baseMapper.getSysPermissionById(id);
    }
}
