package net.semsun.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@Controller
public class Test1Controller {
    @RequestMapping("test")
    @ResponseBody
    public String test(HttpServletRequest request) {
        String sessionId = request.getSession().getId();

        return sessionId;
    }

    @RequestMapping("header")
    @ResponseBody
    public String header(HttpServletRequest request) {
        Map<String, String> map = new HashMap<String, String>();

        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key  = (String) headerNames.nextElement();
            String value = request.getHeader(key);

            map.put(key, value);
        }

        return JSONObject.toJSONString(map);
    }
}
