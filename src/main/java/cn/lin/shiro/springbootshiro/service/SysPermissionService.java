package cn.lin.shiro.springbootshiro.service;

import cn.lin.shiro.springbootshiro.entity.SysPermission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 权限表 服务类
 * </p>
 *
 * @author laury
 * @since 2019-02-21
 */
public interface SysPermissionService extends IService<SysPermission> {
    /**
     * 根据用户id查询权限信息
     * @param id
     * @return
     */
    List<SysPermission> getSysPermissionById(Integer id);
}
