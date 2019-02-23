package cn.lin.shiro.springbootshiro.controller;


import cn.lin.shiro.springbootshiro.entity.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author laury
 * @since 2019-02-21
 */
@Controller

public class SysUserController {

    @RequestMapping("login")
    public String tologin(){
        return "login";
    }

    @PostMapping("doLogin")
    public String doLogin(SysUser user, HttpSession session){
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
        session.setAttribute("username",user.getUsername());
        SecurityUtils.getSubject().login(token);
        //用重定向，防止重复提交表单
        return "redirect:index";
    }

    @RequestMapping("loginout")
    public String loginout(){
        SecurityUtils.getSubject().logout();
        return "redirect:login";
    }

}
