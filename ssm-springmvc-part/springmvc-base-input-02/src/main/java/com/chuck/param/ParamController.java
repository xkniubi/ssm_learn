package com.chuck.param;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("param")
public class ParamController {

    @RequestMapping("data")
    public String setupForm(String name,int age) {
        System.out.println("name = " + name  + "age ="+ age);
        return name+age;
    }


    @RequestMapping("data1")
    public String setupForm1(@RequestParam(name="username") String name, @RequestParam(required = false,defaultValue = "18") int age){
        System.out.println("name = " + name+"age ="+age);
        return name +age;
    }

    @RequestMapping("data2")
    public String setupForm2(@RequestParam List<String> hbs){
        System.out.println("hbs = " + hbs);
        return "ok";

    }

    @RequestMapping("data3")
    public String setupForm3(String name,int age){
        System.out.println("name = " + name+"age ="+age);
        return "success";
    }

}
