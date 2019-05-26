package com.kopoto.yhh.user;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConditionalOnExpression(UserAutoConfiguration.EXCLUDE_SPI_PROVIDER) // 本地实现SPI时避免 SPI 的实例化
@EnableFeignClients(basePackageClasses = {UserAutoConfiguration.class})
public class UserAutoConfiguration {
    /**
     * 服务名
     */
    public final static String FEIGN_CLIENT_NAME = "user-server";
    static final String EXCLUDE_SPI_PROVIDER = "#{'${spring.application.name}'!='user-server'}";
}

