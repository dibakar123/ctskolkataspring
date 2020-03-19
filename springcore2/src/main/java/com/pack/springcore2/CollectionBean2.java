package com.pack.springcore2;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class CollectionBean2 {
	@Autowired
    private Set<String> nameList2;
 
    public void printNameList() {
        System.out.println(nameList2);
    }
}
