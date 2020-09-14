package com.neusoft.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author shihaobo
 * @date 2020/9/14 15:19
 */
public class InvocationHandlerImpl implements InvocationHandler {
    //目标对象
    Object target;
    public InvocationHandlerImpl( Object obj ){
        target = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //在代理真实对象前我们可以添加一些自己的操作
        System.out.println("在调用之前，我要干点啥呢？");

        System.out.println("Method:" + method);

        //当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object returnValue = method.invoke(target, args);

        //在代理真实对象后我们也可以添加一些自己的操作
        System.out.println("在调用之后，我要干点啥呢？");


        return result;
    }
    public static void main(String [] args){
        //目标对象
        RealSubject subject = new RealSubject();
        //代理对象
        InvocationHandler handler =new InvocationHandlerImpl(subject);
        //最终的含有目标对象的代理对象
//        Subject s = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),
//                subject.getClass().getInterfaces(),handler);
//        String msg = s.SayGoodBye();
    }
}
