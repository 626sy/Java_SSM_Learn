package com.neusoft.test;

import com.neusoft.config.SpringConfiguration;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shihaobo
 * @date 2020/9/7 10:05
 */
public class TestQueryRunner {
    // 测试是否是单例模式
    public void testQueryRunner(){
        // 获取容器
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        // 获取qr对象
        QueryRunner runner = ac.getBean("runner", QueryRunner.class);
        QueryRunner runner1 = ac.getBean("runner",QueryRunner.class);
        System.out.println(runner == runner1);
    }
}
