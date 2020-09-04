package com.neusoft.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author shihaobo
 * @date 2020/9/4 10:10
 */
public class Emp implements Serializable {
//    private int empno;
//    private String ename;
//    private String job;
//    private int mgr;
//    private Date hiredate;
//    private int sal;
//    private int comm;
//    private int deptno;
    private int emp_no ;
    private String e_name;
    private String e_job;
    private Integer mgr;
    private Date hiredate;
    private int sal;
    private int comm;
    private int dept_no;

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getE_job() {
        return e_job;
    }

    public void setE_job(String e_job) {
        this.e_job = e_job;
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

    public void setHiredate(Date hirdate) {
        this.hiredate = hirdate;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getComm() {
        return comm;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "emp_no=" + emp_no +
                ", e_name='" + e_name + '\'' +
                ", e_job='" + e_job + '\'' +
                ", mgr=" + mgr +
                ", hirdate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", dept_no=" + dept_no +
                '}';
    }
}
