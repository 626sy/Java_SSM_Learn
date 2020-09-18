package com.neusoft.po;

import java.util.Date;

/**
 * @author shihaobo
 * @date 2020/9/17 9:19
 */
public class Probation {
    private int probid;
    private int empid;
    private Date bigtime;
    private Date endtime;
    private String rslt;

    public int getProbid() {
        return probid;
    }

    public void setProbid(int probid) {
        this.probid = probid;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public Date getBigtime() {
        return bigtime;
    }

    public void setBigtime(Date bigtime) {
        this.bigtime = bigtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getRslt() {
        return rslt;
    }

    public void setRslt(String rslt) {
        this.rslt = rslt;
    }
}
