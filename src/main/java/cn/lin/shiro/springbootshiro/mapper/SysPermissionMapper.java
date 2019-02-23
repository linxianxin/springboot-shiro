package cn.lin.shiro.springbootshiro.mapper;

import cn.lin.shiro.springbootshiro.entity.SysPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 权限表 Mapper 接口
 * </p>
 *
 * @author laury
 * @since 2019-02-21
 */
public interface SysPermissionMapper extends BaseMapper<SysPermission> {
    /**
     * 根据用户id查询权限信息
     * @param id
     * @return
     */
    List<SysPermission> getSysPermissionById(Integer id);
}
