package cn.lin.shiro.springbootshiro.exception;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



/**
 * @ClassName GolbalException
 * @Description 全局异常处理
 * @Author lainuy
 * @Date 2019/2/21 18:23
 */
@ControllerAdvice
public class GolbalException {
    @ExceptionHandler(AuthenticationException.class)
    public String authenticationException(AuthenticationException e, Model model){
        String msg=null;
        if(e instanceof DisabledAccountException){
            msg="账户异常";
        }else if (e instanceof IncorrectCredentialsException){
            msg = "账户/密码错误";
        }else {
            msg = "系统发生异常";
        }
        model.addAttribute("Msg",msg);
        return "login";
    }


    @ExceptionHandler(UnauthorizedException.class)
    public String nauthorizedExceptionu(){
        return "error/unauthorizedException";
    }
}
