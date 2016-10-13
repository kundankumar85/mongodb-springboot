package com.mongo.test.entity;

public class Address {
	
	private String houseName;
	private String addrLine1;
	private String addrLine2;
	
	
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getAddrLine1() {
		return addrLine1;
	}
	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}
	public String getAddrLine2() {
		return addrLine2;
	}
	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}
	@Override
	public String toString() {
		return "Address [houseName=" + houseName + ", addrLine1=" + addrLine1 + ", addrLine2=" + addrLine2 + "]";
	}
	
	
	

}
