package cn.icast.day07;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *  单例
 *  控制器Action
 *  处理器Action
 * Created by 聪 on 2017/4/16.
 */
public class HelloAction implements Controller{

    public HelloAction(){
        System.out.println("HelloAction()::"+this.hashCode());
    }

    /**
     * 业务方法
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     * @throws Exception
     */
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("HelloAction::handleRequest()");
        /**
         * ModelAndView表示向视图封装的数据和真实路径
         */
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("message","springmvc应用程序，视图使用逻辑名");
        //封装视图的逻辑名称
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
