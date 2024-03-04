package com.chuck.json;


import com.chuck.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("json")
public class JsonController {

    @RequestMapping("data")
    public String addPerson(@RequestBody Person person){
        return "success";
    }
}
