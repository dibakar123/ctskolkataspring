package com.pack.springcore1;

public class Address {
private String roadName;
private int houseNo;
public String getRoadName() {
	return roadName;
}
public void setRoadName(String roadName) {
	this.roadName = roadName;
}
public int getHouseNo() {
	return houseNo;
}
public void setHouseNo(int houseNo) {
	this.houseNo = houseNo;
}

public void show(){
	System.out.println(houseNo+","+roadName);
}
}
