package com.pack.springcore1;

public class Emp {
private int eid;
private String ename;
private int esal;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEsal() {
	return esal;
}
public void setEsal(int esal) {
	this.esal = esal;
}
public void show(){
	System.out.println(eid+" "+ename+" "+esal);
}
public Emp(int eid, String ename, int esal) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esal = esal;
}
public Emp() {
	super();
}

}
