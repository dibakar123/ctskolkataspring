package com.pack.springcore3;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest1 {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ListObjects list1 = (ListObjects) context.getBean("list1");
        System.out.println(".........\nList with setter: " + list1.getPersonList());
        for(Person p: list1.getPersonList()){
        	System.out.println(p);
        }
        
		ListObjects list2 = (ListObjects) context.getBean("list2");
        System.out.println(".........\nList with constructor: " + list2.getPersonList());
        for(Person p: list2.getPersonList()){
        	System.out.println(p);
        }
        
        
		SetObjects set1 = (SetObjects) context.getBean("set1");
        System.out.println("........\nSet: " + set1.getPersonSet());
        for(Person p: set1.getPersonSet()){
        	System.out.println(p);
        }

		MapObjects map1 = (MapObjects) context.getBean("map1");
        System.out.println(".........\nMap: " + map1.getPersonMap());
        for(Entry<Integer, Person> entry: map1.getPersonMap().entrySet()){
        	System.out.println(entry.getValue());
        }

	}

}
