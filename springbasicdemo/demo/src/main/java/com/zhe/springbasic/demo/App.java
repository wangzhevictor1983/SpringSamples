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
    	CarInterface carInterfaceSampleOne = (CarInterface)context.getBean("car");
    	CarInterface carInterfaceSampleTwo = (CarInterface)context.getBean("car");
    	// singleton test: prove the injection class is a singleton type by default
    	/*
    	for(int i = 0; i < 2; i++)
    	{
    		carInterface.run();
    	}*/
    	carInterfaceSampleOne.run();
    	carInterfaceSampleTwo.run();
    	
    	CarPrototype carInterfacePrototypeOne = context.getBean("carPrototype", CarPrototype.class);
    	CarPrototype carInterfacePrototypeTwo = context.getBean("carPrototype", CarPrototype.class);
    	// singleton test: prove the injection class is a singleton type by default
    	/*
    	for(int i = 0; i < 2; i++)
    	{
    		carInterface.run();
    	}*/
    	carInterfacePrototypeOne.run();
    	carInterfacePrototypeTwo.run();
    	carInterfacePrototypeOne.run();
    	
    	System.out.println(carInterfacePrototypeOne.hashCode());
    	System.out.println(carInterfacePrototypeTwo.hashCode());
    	
    	//System.out.println( "Hello World!" );
    	
    	
    }
}
