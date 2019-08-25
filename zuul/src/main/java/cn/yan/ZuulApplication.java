package cn.yan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @EnableZuulProxy 包含了 @EnableZuulServer 设置该类是网关的启动类
 *
 *@EnableAutoConfiguration 可以帮助Spring Boot 应用将所有符合条件的‘
 * @Configuration’ 加载到当前的Spring Boot 创建并使用的ioc容器中
 *
 * Zuul 自带负载均衡的功能
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
