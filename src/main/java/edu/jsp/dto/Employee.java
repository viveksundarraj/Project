package edu.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String name;
     private String loc;
     private double sal;
     private String job;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", loc=" + loc + ", sal=" + sal + ", job=" + job + "]";
	}
     
     

}
