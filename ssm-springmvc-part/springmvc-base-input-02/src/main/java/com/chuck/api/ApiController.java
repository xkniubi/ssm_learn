package com.chuck.api;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
@RequestMapping("api")
public class ApiController {

    @Autowired
    private ServletContext servletContext;

    @RequestMapping("data")
    public void data(HttpServletResponse servletResponse, HttpServletRequest servletRequest, HttpSession session){

        ServletContext servletContext = servletRequest.getServletContext();
        ServletContext servletContext1 = session.getServletContext();

        System.out.println("servletContext1 = " + servletContext1);
    }
}
