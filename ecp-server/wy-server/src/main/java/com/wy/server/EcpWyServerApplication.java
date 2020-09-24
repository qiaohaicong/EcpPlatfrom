package com.wy.server;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:spring/spring-application-redis.xml")
@MapperScan("com.wy.server.auto.mapper")
public class EcpWyServerApplication {

    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        SpringApplication.run(EcpWyServerApplication.class, args);
    }

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        String ss = "wangbadan";
        logger.info("nishi shabi::::***{}",ss);
        return new PaginationInterceptor();
    }

}
