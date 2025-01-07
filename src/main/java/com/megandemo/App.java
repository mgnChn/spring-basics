package com.megandemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // Creates the container
//        Dev obj = (Dev) context.getBean("dev"); <- This is how to cast bean to Dev class
        Dev obj = context.getBean(Dev.class); // This looks in spring.xml and looks for class="com.megandemo.Dev", which shows Dev is the type for the Dev class bean

        obj.build();
//        obj.setAge(18);
        System.out.println(obj.getAge() );
    }
}