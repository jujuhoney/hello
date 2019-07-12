package com.liveramp.lb.demo.controller;

import com.liveramp.lb.demo.mapper.TestMapper;
import com.liveramp.lb.demo.service.StudentService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
public class Controller {
    @Autowired
    StudentService studentService;
    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo()

    {
        return "hello world!";
    }
    @GetMapping
   // @ResponseBody
    public String returnDataToHtml(HttpServletRequest request){
//        request.setAttribute();
        System.out.println(studentService.getOne());
        return "hello";
    }
}
