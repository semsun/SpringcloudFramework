package net.semsun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class NormalController {
    @Autowired
    private Test1ServiceController test1ServiceController;

    @RequestMapping("/test_normal")
    @ResponseBody
    public String testNormal() {
        return test1ServiceController.test();
    }
}
