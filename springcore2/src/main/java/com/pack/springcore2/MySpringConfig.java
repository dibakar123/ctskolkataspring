package com.pack.springcore2;


import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringConfig {
	@Bean
    public CollectionBean1 getCollectionsBean1() {
        return new CollectionBean1();
    }
 
    @Bean
    public List<String> nameList1() {
        return Arrays.asList("John", "Adam", "Harry","Adam");
    }
    
	@Bean
    public CollectionBean2 getCollectionsBean2() {
        return new CollectionBean2();
    }
 
    @Bean
    public Set<String> nameList2() {
    	HashSet<String> hset= new HashSet<String>();
    	hset.add("John");
    	hset.add("Adam");
    	hset.add("Harry");
    	return hset;
    }    
}
