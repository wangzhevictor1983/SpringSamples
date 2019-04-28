package com.zhe.springbasic.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
    	context = new ClassPathXmlApplicationContext("applicationContext.xml");;
    	for(String str : context.getBeanDefinitionNames()) {
    		System.out.println(str);
    	}
        //System.out.println( "Hello World!" );
    }
}
