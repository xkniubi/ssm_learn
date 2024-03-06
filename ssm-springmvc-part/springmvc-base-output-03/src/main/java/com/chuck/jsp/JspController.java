package com.chuck.jsp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jsp")
public class JspController {

    @GetMapping("home")
    public String Index(HttpServletRequest request){
        request.setAttribute("msg","hello jsp!!!");
        return "home";
    }

    @GetMapping("forward")
    public String Forward(){
        System.out.println("JspController.Forward");
        return "forward:/jsp/home";
    }

    @GetMapping("redirect")
    public String Redirect(){
        System.out.println("JspController.Forward");
        return "redirect:/jsp/home";
    }

    @GetMapping("redirectBaidu")
    public String RedirectBaidu(){
        System.out.println("JspController.Forward");
        return "redirect:http://www.baidu.com";
    }
}
