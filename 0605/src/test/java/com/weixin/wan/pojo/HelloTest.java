package com.weixin.wan.pojo;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 白扬
 * @date 2022/6/16  16:16
 */
public class HelloTest extends TestCase {

    public void testGetStr() {
        //获取Spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello  hello = (Hello) context.getBean("hello");
        System.out.println( hello.toString());
    }
}