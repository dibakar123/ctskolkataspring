package com.pack.springcore1;

import java.util.List;

public interface EmpDao {
	void create(Emp emp);  
	Emp getEmp(int empid); 
	List<Emp> listEmployees();
}