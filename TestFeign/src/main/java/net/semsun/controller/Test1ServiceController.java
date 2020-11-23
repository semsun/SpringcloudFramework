package net.semsun.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@FeignClient(value = "test1-service")
public interface Test1ServiceController {
    @RequestMapping( value = "/t1/test", method = RequestMethod.POST)
    public String test();
}
