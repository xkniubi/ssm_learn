package com.chuck.path;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
@ResponseBody
public class PathController {

    @RequestMapping("{id}/{username}" )
    public String getUser(@PathVariable Long id,@PathVariable("username") String name){
        System.out.println("id = " + id);
        return name+id;
    }
}
