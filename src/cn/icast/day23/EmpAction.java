package cn.icast.day23;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 在业务控制方法中收集List<JavaBean>参数
 *
 * Created by 聪 on 2017/4/16.
 */
@Controller
@RequestMapping(value = "/emp")
public class EmpAction {
    /**
     * 批量添加员工
     */
    @RequestMapping(value = "/addAll")
    public String addAll(Model model,Bean bean) throws Exception{
        for(Emp emp:bean.getEmpList()) {
            System.out.println(emp.getUsername() + ":" + emp.getSalary());
        }
        model.addAttribute("message","批量增加员工成功");
        return "/jsp/ok.jsp";
    }
}
