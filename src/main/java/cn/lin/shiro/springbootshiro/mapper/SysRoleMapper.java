package cn.lin.shiro.springbootshiro.mapper;

import cn.lin.shiro.springbootshiro.entity.SysRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author laury
 * @since 2019-02-21
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {
    /**
     * 根据用户id获得用户角色
     *
     * @Parm userId
     */
    List<SysRole> getRoleById(Integer userId);

}
