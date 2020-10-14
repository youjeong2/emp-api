package com.pic2cheese.api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @RequestMapping("/test")
    public @ResponseBody User test(User user) throws Exception{
        user.setId("test");
        user.setName("testName");
        return user;
    }
}