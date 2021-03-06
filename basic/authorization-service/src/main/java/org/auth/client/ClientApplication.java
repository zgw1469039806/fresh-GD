package org.auth.client;


import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.sql.DataSource;

/**
 * @DATA 2019-04-11 16:28
 * @Author 张国伟  WeChat:17630376104
 * @Description 用户中心
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("org.auth.client.mapper")
public class ClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class,args);
    }
}
