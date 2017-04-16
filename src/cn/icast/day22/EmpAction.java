package cn.icast.day22;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 在业务控制方法中收集数组参数
 *
 * Created by 聪 on 2017/4/16.
 */
@Controller
@RequestMapping(value = "/emp")
public class EmpAction {
    @RequestMapping(value = "/deleteAll")
    public String deleteAll(Model model,int[] ids) throws Exception{
        System.out.println("需要删除的员工编号分别是：");
        for(int id : ids){
            System.out.print(id+" ");
        }
        model.addAttribute("message","批量删除员工成功");
        return "/jsp/ok.jsp";

    }
}
