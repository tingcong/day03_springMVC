package cn.icast.example.service;

import cn.icast.example.dao.EmpDao;
import cn.icast.example.entity.Emp;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 聪 on 2017/4/17.
 */

@Component("empService")
public class EmpService {
    private EmpDao empDao;

    @Resource(name = "empDao")
    public void setEmpDao(EmpDao empDao){
        this.empDao=empDao;
    }

    /**
     * 查询所有员工
     */
    public List<Emp> findAllEmp() throws Exception{
        return empDao.findAll();
    }
}
