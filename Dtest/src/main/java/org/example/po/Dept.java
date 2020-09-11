package org.example.po;

import java.util.List;

/**
 * @author shihaobo
 * @date 2020/9/11 9:52
 */
public class Dept {
    private int deptid;
    private String dname;
    private List<Emp> les;

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Emp> getLes() {
        return les;
    }

    public void setLes(List<Emp> les) {
        this.les = les;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptid=" + deptid +
                ", dname='" + dname + '\'' +
                ", les=" + les +
                '}';
    }
}
