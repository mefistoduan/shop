package com.mefisto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;
import com.mefisto.Entity;

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

    @RequestMapping(value = "/data")
//    public List<Entity> data() {
//        List<Entity> list = new ArrayList<Entity>();
//
//        for (int i = 0; i < 10; i++) {
//            Entity Entity = new Entity();
//            Entity.setId(i + 1);
//            Entity.setName("springboot" + i);
//            Entity.setSex("male");
//            Entity.setAge(i + 1);
//            Entity.setRole("developer");
//
//            list.add(Entity);
//        }
//
//        return list;
//    }
    public String rtnCode() {
        return "{rtnCode:0,rs:[{springboot:444}],rtnMemo:123}";
    }

}

//{"rtnCode":0,"rs":[],"rtnMemo":"\u6b63\u5e38"}