package com.neusoft.po;

import java.util.Date;

/**
 * @author shihaobo
 * @date 2020/9/17 9:20
 */
public class WorkLog {
    private int logid;
    private String loginfo;
    private Date optime;
    private int clss;
    private int empid;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getLogid() {
        return logid;
    }

    public void setLogid(int logid) {
        this.logid = logid;
    }

    public String getLoginfo() {
        return loginfo;
    }

    public void setLoginfo(String loginfo) {
        this.loginfo = loginfo;
    }

    public Date getOptime() {
        return optime;
    }

    public void setOptime(Date optime) {
        this.optime = optime;
    }

    public int getClss() {
        return clss;
    }

    public void setClss(int clss) {
        this.clss = clss;
    }
}
