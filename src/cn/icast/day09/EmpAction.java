package cn.icast.day09;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  控制器是实现Controller接口的类
 * Created by 聪 on 2017/4/16.
 */
public class EmpAction implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView=new ModelAndView();
        httpServletRequest.setCharacterEncoding("UTF-8");
        String username=httpServletRequest.getParameter("username");
        System.out.println("员工姓名："+username);
        modelAndView.addObject("message",username);
        modelAndView.setViewName("/jsp/success.jsp");
        return modelAndView;
    }

    /**
     * 1)Action类实现Controller接口，带来了代码耦合
     * 2)如果参数过多，实现Controller接口的Action收集起来不便
     */
}
