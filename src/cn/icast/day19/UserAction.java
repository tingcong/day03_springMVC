package cn.icast.day19;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 聪 on 2017/4/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserAction {
    /**
     * 自定义类型转换器
     */
    @InitBinder
    public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception{
        binder.registerCustomEditor(
                Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true)
        );
    }

    /**
     * 用户注册，只能接收POST请求
     */
    @RequestMapping(value = "register")
    public String registerMethod(User user, Model model) throws Exception{
        System.out.println("用户注册:" + user.toString());
        //将user绑定到model对象中
        model.addAttribute("user",user);
        //转发到success.jsp页面
        return "/jsp/success.jsp";
    }
}
