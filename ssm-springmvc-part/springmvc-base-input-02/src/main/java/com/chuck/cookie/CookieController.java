package com.chuck.cookie;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("cookie")
public class CookieController {

    @RequestMapping("data")
    public String data(@CookieValue(value="cookieName") String value){
        System.out.println("value = " + value);
        return value;
    }

    @RequestMapping("save")
    public String save(HttpServletResponse response){
        Cookie cookie = new Cookie("cookieName","root");
        response.addCookie(cookie);
        return "ok";
    }
}
