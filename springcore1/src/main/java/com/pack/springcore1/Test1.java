package com.pack.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {  
    public static void main(String[] args) {  
          
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Employee e = context.getBean("e",Employee.class);;
    	e.show();
    	Employee e1 = context.getBean("e1",Employee.class);;
    	e1.show();    	
    	Employee2 e2 = context.getBean("ee",Employee2.class);;
    	e2.show();    
    	Employee3 e3 = context.getBean("e3",Employee3.class);;
    	e3.show();    	      	
    }  
}  