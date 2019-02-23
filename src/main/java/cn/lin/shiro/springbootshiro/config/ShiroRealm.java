package cn.lin.shiro.springbootshiro.config;

import cn.lin.shiro.springbootshiro.entity.SysPermission;
import cn.lin.shiro.springbootshiro.entity.SysRole;
import cn.lin.shiro.springbootshiro.entity.SysUser;
import cn.lin.shiro.springbootshiro.service.SysPermissionService;
import cn.lin.shiro.springbootshiro.service.SysRoleService;
import cn.lin.shiro.springbootshiro.service.SysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @ClassName ShiroRealm
 * @Description 在自定义数据认证
 * @Author lainuy
 * @Date 2019/2/21 14:55
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysPermissionService sysPermissionService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //获得已经认证的用户信息
        SysUser user = (SysUser) principalCollection.getPrimaryPrincipal();
        //根据用户id查询用户角色
        List<SysRole> roles = sysRoleService.getRoleById(user.getId());
        //函数式编程
        Set<String> roles1 = roles.stream().map(SysRole::getRole).collect(Collectors.toSet());
        authorizationInfo.setRoles(roles1);
        //根据用户id查询权限信息
        List<SysPermission> permissions= sysPermissionService.getSysPermissionById(user.getId());
        Set<String> permissions1 = permissions.stream().map(SysPermission::getPermission).collect(Collectors.toSet());
        authorizationInfo.setStringPermissions(permissions1);
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
       //获得用户名
        String username = (String )authenticationToken.getPrincipal();
        //根据用户名查询用户信息
        SysUser user = sysUserService.getUserByName(username);
        //判断用户存在
        if(Objects.isNull(user)){
            throw new UnknownAccountException();
        }
        //判断用户状态
        if(Objects.equals(2,user.getStatus())||Objects.equals(3,user.getStatus())){
            throw new DisabledAccountException();
        }
        return new SimpleAuthenticationInfo(user,user.getPassword(), ByteSource.Util.bytes(user.getSalt()),getName());

    }
}
