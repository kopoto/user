package com.kopoto.yhh.user.controller;

import com.kopoto.yhh.pikachu.spi.TestSpi;
import com.kopoto.yhh.user.Service.StudentService;
import com.kopoto.yhh.user.entity.Student;
import com.kopoto.yhh.user.spi.HelloSpi;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping("/index")
    public String index() {
        Student one = studentService.one(1);
        int test = testSpi.test();
        System.out.println(test);
        return "Greetings from Spring Boot!";
    }
}



