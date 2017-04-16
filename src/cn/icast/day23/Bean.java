package cn.icast.day23;

import java.util.ArrayList;
import java.util.List;

/**
 *  封装多个Emp的对象
 * Created by 聪 on 2017/4/16.
 */
public class Bean {
    private List<Emp> empList = new ArrayList<Emp>();
    public Bean(){}
    public List<Emp> getEmpList() {
        return empList;
    }
    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }
}
