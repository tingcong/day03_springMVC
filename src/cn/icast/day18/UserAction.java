package cn.icast.day18;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 聪 on 2017/4/16.
 */
@Controller
@RequestMapping(value="/user")
public class UserAction {
    /**
     * 自定义类型转换器
     */
    @InitBinder
    public void initBinder(HttpServletRequest request,ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(
                Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"),true));
    }

    /**
     * 用户注册，只能接收POST请求
     */
    @RequestMapping(value="/register")
    public String registerMethod(HttpServletRequest request, HttpServletResponse response) throws Exception{
        //获取用户名和薪水
        String username = request.getParameter("username");
        String salary = request.getParameter("salary");
        System.out.println("用户注册-->" + username + ":" + salary);

        //绑定到session域对象中
        request.getSession().setAttribute("username",username);
        request.getSession().setAttribute("salary",salary);

        //重定向/jsp/success.jsp页面
        //response.sendRedirect(request.getContextPath()+"/jsp/success.jsp");

        //转发/jsp/ok.jsp页面
        request.getRequestDispatcher("/jsp/ok.jsp").forward(request,response);

        //转发(提倡)
        return "/jsp/success.jsp";
    }
}
