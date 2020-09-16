package com.neusoft;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author shihaobo
 * @date 2020/9/15 16:42
 */
@Aspect
public class Qiemian {
    @Pointcut("execution(* com.neusoft.*.add*(..))")
    private void allAddMethod(){}

    @Before("execution(* com.neusoft.*.add*(..))")
    public void qianZhi1(){
        System.out.println("-------11111111111111111111-------------");
    }
    public void qianZhi2(){
        System.out.println("-------22222222222222222222-------------");
    }

    // 前置通知
    public void qianZhi(){
        System.out.println("-------qianZhi-----------");
    }
    // 最终通知
    @After("allAddMethod()")
    public void zuiZhong(){
        System.out.println("-------zuiZhong-----------");
    }
    // 异常通知

    public void yiChang(Exception ex){
        System.out.println(ex.getMessage());
        System.out.println("--------异常---------");
    }

    /**
     * after-returning 后置通知
     * joinpoint 执行了return语句
     * @param rtv
     */
    @AfterReturning(pointcut = "allAddMethod()" ,returning="rtv")
    public void houZhi(Object rtv){
        System.out.println("houZhi="+rtv);
        System.out.println("--------houZhi-----------");
    }

    /**
     * 环绕通知
     * 方法形参必须有:ProceedingJoinPoint pjp,否则无法调用业务代码
     * 反法必须有返回值,否则无法获得业代码的返回值
     * 方法体必须显式执行,Object retVal = pjp.proceed();  // 回调业务逻辑(JoinPoint方法)
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("allAddMethod()")
    public Object huanRao(ProceedingJoinPoint pjp) throws Throwable{

        //先干点什么
        System.out.println("-------先干点什么，比如SqlConnection------------");
        //真正的业务
        Object retVal = pjp.proceed();  // 回调真正的方法
        // 后干点什么
        System.out.println("-------然后再干点什么---------------");
        return retVal;
    }
}
