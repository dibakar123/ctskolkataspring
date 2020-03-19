package com.pack.DIWithAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIAppTestForAnnotation 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
    	context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	DIWithAnnotationClass di=(DIWithAnnotationClass)context.getBean("dIWithAnnotationClass");
    	di.run();
    	
    	NiceWriter niceWriter =(NiceWriter)context.getBean("niceWriter");
    	niceWriter.writer("God Goddess are good");
    }
}
