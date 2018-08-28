package com.mefisto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HelloController {

//    入口文件
    @RequestMapping(value = "/index")
    public String index() {
        return "/index.html";
    }

//    服务端口
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }
}