package cn.lin.shiro.springbootshiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexCotroller
 * @Description TODO
 * @Author lainuy
 * @Date 2019/2/21 15:37
 */
@Controller
public class IndexCotroller {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
