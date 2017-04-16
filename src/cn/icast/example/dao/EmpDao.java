package cn.icast.example.dao;

import cn.icast.example.entity.Emp;
import cn.icast.example.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 聪 on 2017/4/16.
 */
@Component(value = "empDao")
public class EmpDao {

    /**
     * 查询所有员工
     */
    public List<Emp> findAll() throws Exception{
        QueryRunner runner=JdbcUtils.getQueryRunner();
        String sql="SELECT empno,ename,job,mrg,hiredate,sal,comm,deptno FROM EMP";
        return runner.query(sql,new BeanListHandler<Emp>(Emp.class));
    }

    @Test
    public void testFindAll() throws Exception{
        EmpDao dao = new EmpDao();
        for(Emp emp : dao.findAll()){
            System.out.println(emp.getEmpno()+":"+emp.getEname()+":"+emp.getSal());
        }
    }
}
