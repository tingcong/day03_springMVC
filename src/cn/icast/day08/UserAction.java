package cn.icast.day08;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  控制器
 * Created by 聪 on 2017/4/16.
 */
public class UserAction implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("操作用户：胡廷聪");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("message","操作用户成功");
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
