package cn.lin.shiro.springbootshiro.interceptor;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName PageInterceptor
 * @Description 分页配置
 * @Author lainuy
 * @Date 2019/2/22 17:46
 */

@Configuration
@MapperScan("cn.lin.shiro.springbootshiro.mapper")
public class PageInterceptor {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }
}
