package com.mirdu.BasicSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
    	
    	//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Driver d = context.getBean(Driver.class);
    	d.getVeh().drive();
    }
}
