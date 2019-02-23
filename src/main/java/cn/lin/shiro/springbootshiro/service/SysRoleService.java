package cn.lin.shiro.springbootshiro.service;

import cn.lin.shiro.springbootshiro.entity.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author laury
 * @since 2019-02-21
 */
public interface SysRoleService extends IService<SysRole> {
    /**
     * 根据用户id获得用户角色
     *
     * @Parm userId
     */
    List<SysRole> getRoleById(Integer userId);

}
