package com.neusoft.domain;

import java.util.List;

/**
 * @author shihaobo
 * @date 2020/9/4 20:08
 */
public class QueryVo {
    private Emp emp;
    private List<Integer> ids;

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "emp=" + emp +
                ", ids=" + ids +
                '}';
    }
}
