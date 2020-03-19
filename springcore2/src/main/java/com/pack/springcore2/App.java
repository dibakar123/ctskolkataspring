package com.pack.springcore2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
    	CollectionBean1 collectionsBean1 = context.getBean(CollectionBean1.class);
    	collectionsBean1.printNameList();
    	CollectionBean2 collectionsBean2 = context.getBean(CollectionBean2.class);
    	collectionsBean2.printNameList();    	
    }
}
