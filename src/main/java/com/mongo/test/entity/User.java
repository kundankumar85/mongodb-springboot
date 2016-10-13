package com.mongo.test.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.querydsl.core.annotations.QueryEntity;

@QueryEntity
@Document(collection="user")
public class User {
	
	private String id;
	private String name;
	private Integer empid;
	private Date entryDate = null;
	
	private Department department;
	
	List<Address> userAddr;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<Address> getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(List<Address> userAddr) {
		this.userAddr = userAddr;
	}
	
	
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", empid=" + empid + ", entryDate=" + entryDate + ", department="
				+ department + ", userAddr=" + userAddr + "]";
	}
	
	

}
