package cn.icast.example.entity;

import java.util.Date;

/**
 * Created by 聪 on 2017/4/16.
 */
public class Emp {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private Integer sal;
    private Integer comm;
    private Integer deptno;
    public Emp(){}
    public Integer getEmpno() {
        return empno;
    }
    public void setEmpno(Integer empno) {
        this.empno = empno;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public Integer getMgr() {
        return mgr;
    }
    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }
    public Date getHiredate() {
        return hiredate;
    }
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
    public Integer getSal() {
        return sal;
    }
    public void setSal(Integer sal) {
        this.sal = sal;
    }
    public Integer getComm() {
        return comm;
    }
    public void setComm(Integer comm) {
        this.comm = comm;
    }
    public Integer getDeptno() {
        return deptno;
    }
    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
}