package com.shahid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spconfig.xml");
        
        EmployeeBean e1 = (EmployeeBean)ctx.getBean("oldAdd");
        
        e1.Employee();
    }
}
