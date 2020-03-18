package com.pack.springcore1;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTest {
	 private static ApplicationContext context;

		public static void main( String[] args )    {
	    	context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    	EmpDao empDao = (EmpDao) context.getBean("empDaoImpl");  
		    
	    	Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id to insert a new record:");  
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Name:"); 
			String name = sc.nextLine();
	        System.out.println("Enter Salary:");  
	        int sal = Integer.parseInt(sc.nextLine());
	        sc.close();
	        
	        Emp emp = new Emp(id,name,sal);
	        
	        empDao.create(emp);
			System.out.println("Done" );  

			System.out.println("----All Data  -----" );  
	        List<Emp> emplist = empDao.listEmployees();
	        for(Emp e:emplist)
	        	System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsal());
	        
	        System.out.println("----Check Data  -----" );  
	        Emp e = empDao.getEmp(1211);
	        if(e!=null)
	        	System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsal());
	        else
	        	System.out.println("Empid 1211 is nt found");
	        
	        
	    }
}
