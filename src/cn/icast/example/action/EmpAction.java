package cn.icast.example.action;

import cn.icast.example.entity.Emp;
import cn.icast.example.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 聪 on 2017/4/17.
 */
@Controller
@RequestMapping(value = "/emp")
public class EmpAction {
    private EmpService empService;
    @Resource(name = "empService")
    public void setEmpService(EmpService empService){
        this.empService=empService;
    }

    /**
     * 查询所有的员工
     */
    @RequestMapping(value = "/findAllEmpMethod")
    public @ResponseBody Map<String,Object> findAllMethod() throws Exception{
        List<Emp> empList=empService.findAllEmp();

        Map<String,Object> map=new LinkedHashMap<String,Object>();

        map.put("total",empList.size());
        map.put("rows",empList);
        return map;
    }
}
