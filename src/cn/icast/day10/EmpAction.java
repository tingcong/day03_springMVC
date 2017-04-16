package cn.icast.day10;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *  单例
 *  处理类
 * Created by 聪 on 2017/4/16.
 */
@SuppressWarnings("deprecation")
public class EmpAction extends AbstractCommandController{

    public EmpAction(){
        //将表单数据封装到Emp对象中去
        this.setCommandClass(Emp.class);
    }


    /**
     * 自定义类型转换器，将String->Date类型(格式yyyy-MM-dd)
     */
//    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder){
//        //向springmvc内部注入一个自定义的类型转换器
//        //参数一：将String转成什么类型的字节码
//        //参数二：自定义转换规则
//        //true表示该日期字段可以为空
//        binder.registerCustomEditor(
//                Date.class,
//                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"))
//        );
//    }
    @Override
    protected ModelAndView handle(
            HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse,
            Object o,
            BindException e) throws Exception {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("messsage","增加员工成功！");
        Emp emp= (Emp) o;
        System.out.println(emp.getUsername()+":"+emp.getGender()+":"+emp.getHiredate().toLocaleString());
        //将Emp封装到ModeAndView对象中
        modelAndView.addObject("emp",emp);

        modelAndView.setViewName("/jsp/success.jsp");
        return modelAndView;
    }
}
