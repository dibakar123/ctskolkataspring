package com.pack.springcore3;

import java.util.*;

public class ListObjects {

	List<Person> personList;
	
	public List<Person> getPersonList() {
		return personList;
	}
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
	public ListObjects(List<Person> personList) {
		super();
		this.personList = personList;
	}
	public ListObjects() {
		super();
	}
	
	
}
