package com.trasen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller()
@RequestMapping("/ueditor")
public class testController {
    @RequestMapping(value = "content",method = RequestMethod.POST)
    @ResponseBody
    public String test(HttpServletRequest req, HttpServletResponse res, String content) throws IOException {
        System.out.println(content);
        res.setHeader("Content-type","application/json");
        res.setCharacterEncoding("utf-8");
        StringBuilder sb = new StringBuilder();
        sb.append(content);
        return sb.toString();
    }
}
