package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/9/15 16:42
 */
public class Qiemian {
    public void qianZhi(){
        System.out.println("-------qianZhi-----------");
    }

    /**
     * after-returning 后置通知
     * joinpoint 执行了return语句
     * @param rtv
     */

    public void houZhi(Object rtv){
        System.out.println("houZhi="+rtv);
        System.out.println("--------houZhi-----------");
    }
}
