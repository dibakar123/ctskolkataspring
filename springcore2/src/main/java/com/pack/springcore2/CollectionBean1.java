package com.pack.springcore2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CollectionBean1 {
	@Autowired
    private List<String> nameList1;
 
    public void printNameList() {
        System.out.println(nameList1);
    }
}
