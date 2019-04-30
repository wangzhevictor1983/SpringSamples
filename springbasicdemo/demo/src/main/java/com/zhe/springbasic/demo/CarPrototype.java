package com.zhe.springbasic.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zhe.springbasic.demo.CarInterface;

public abstract class CarPrototype implements CarInterface, BeanFactoryAware {

/*	private String brand = "Prototype";
	private String maxSpeed = "300";
	private String price = "350000.0";
	private static int index = 0;*/

	private BeanFactory factory;
	private CarInterface carInterface;
	public void run() {
		this.carInterface = (CarInterface)factory.getBean("prototypeCar");
		carInterface.run();

		// TODO Auto-generated method stub
		//System.out.println("brand:"+brand+",maxSpeed:"+maxSpeed+",price:"+price + ",index:" + index++);

	}
	
	//获取一个命令
	protected abstract CarInterface createCarInterface();
	
	public void setBeanFactory(BeanFactory f) throws BeansException {
	    factory = f;
	  }


}
