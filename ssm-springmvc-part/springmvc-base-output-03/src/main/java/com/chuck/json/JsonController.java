package com.chuck.json;


import com.chuck.pojo.person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("json")
public class JsonController {


    @GetMapping("data")
    public person person(){
        person person = new person();
        person.setAge(18);
        person.setName("ahua");
        return person;
    }

    @GetMapping("data2")
    public List<person> person2(){
        person person = new person();
        person.setAge(18);
        person.setName("ahua");

        List<person> persons = new ArrayList<>();
        persons.add(person);
        return persons;

    }
}
