package org.example.po;

/**
 * @author shihaobo
 * @date 2020/9/11 16:47
 */
public class Obj {
    private int objid;
    private String oname;

    public int getObjid() {
        return objid;
    }

    public void setObjid(int objid) {
        this.objid = objid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "objid=" + objid +
                ", oname='" + oname + '\'' +
                '}';
    }
}
