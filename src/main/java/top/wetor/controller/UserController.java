package top.wetor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User控制器
 * @author wetor
 */
@Controller
public class UserController {
    /**
     * 测试
     * @return
     */
    @RequestMapping("/test")
    public String test(){
        System.out.println("test");
        return "success.jsp";
    }
}
