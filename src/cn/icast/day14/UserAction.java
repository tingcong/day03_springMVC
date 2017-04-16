package cn.icast.day14;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 聪 on 2017/4/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserAction {

    /**
     * 用户注册,即能接收POST请求，又能接收GET请求
     */
    @RequestMapping(value="/register_all")
    public String registerMethod(Model model) throws Exception{
        model.addAttribute("message","员工注册成功");
        return "success";
    }

    /**
     * 用户注册，只能接收POST请求
     */
    @RequestMapping(method= RequestMethod.POST,value="/register_post")
    public String registerMethod(Model model,String username,String salary) throws Exception{
        System.out.println("用户注册-->" + username + ":" + salary);
        model.addAttribute("message","员工注册成功");
        return "/jsp/success.jsp";
    }

    /**
     * 用户登录,
     */
    @RequestMapping(value="/login.action")
    public String loginMethod(Model model) throws Exception{
        model.addAttribute("message","员工登录成功");
        return "success";
    }
}
