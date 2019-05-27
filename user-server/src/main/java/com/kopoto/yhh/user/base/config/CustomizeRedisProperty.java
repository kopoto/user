package com.kopoto.yhh.user.base.config;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.Serializable;

@Data
public class CustomizeRedisProperty implements Serializable {

    private ApplicationContext applicationContext;
    private String host;
    private int port;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

    }

}
