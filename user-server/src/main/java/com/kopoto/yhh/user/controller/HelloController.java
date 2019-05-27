package com.kopoto.yhh.user.controller;

import com.kopoto.yhh.pikachu.spi.TestSpi;
import com.kopoto.yhh.user.Service.StudentService;
import com.kopoto.yhh.user.entity.Student;
import com.kopoto.yhh.user.spi.HelloSpi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloSpi {
    public int test() {
        return 0;
    }
    @Autowired
    private StudentService studentService;
    @Autowired
    private TestSpi testSpi;
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/index")
    public String index() {
        redisTemplate.opsForValue().set("a", "a");
        int test = testSpi.test();
        Object a = redisTemplate.opsForValue().get("a");
        Student one = studentService.one(1);
        return "Greetings from Spring Boot!";
    }


}



