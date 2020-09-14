package com.neusoft.ioc;

import com.neusoft.dao.EmpDaoMySql;
import com.neusoft.dao.EmpDaoOracle;
import com.neusoft.dao.IEmpDao;

/**
 * @author shihaobo
 * @date 2020/9/14 10:00
 */
/**
 * 简单工厂设计模式的代码案例：
 * 1、读取文件
 * 2、构建对象
 */
public class DaoFactory {
    public static IEmpDao getEmpDao(){
        //读取dao.name 值
        String name = "oracle";
        switch ( name ){
            case "oracle" : return new EmpDaoOracle();
            case "mysql" :return  new EmpDaoMySql();
            default:return  null;
        }
    }
}
