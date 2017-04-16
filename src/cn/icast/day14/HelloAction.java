package cn.icast.day14;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 聪 on 2017/4/16.
 */
@Controller
public class HelloAction {
    public HelloAction(){
        System.out.println("HelloAction()::" + this.hashCode());
    }

    /**
     * 业务方法
     * 只要是/hello.action的请求，都交由HelloAction对象中的hello()方法去处理
     */
    @RequestMapping(value = "/hello.action")
    public String hello(Model model) throws Exception{
        System.out.println("HelloAction::hello()方法");
        model.addAttribute("message","您好！");
        return "success";
    }

    /**
     * 业务方法
     * 只要是/bye.action的请求，都交由HelloAction对象中的bye()方法去处理
     */
    @RequestMapping(value = "/bye.action")
    public String bye(Model model)throws Exception{
        System.out.println("HelloAction::bye()方法");
        model.addAttribute("message","再见");
        return "success";
    }
}
