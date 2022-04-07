package com.tec.HibernateSecond;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department 
{
	@Id
	@Column(name="dept_id")
	private int deptid;
	@Column(name="dept_name")
	private String deptName;
	
	@OneToMany(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	@JoinColumn(name="deptid")
	private List<Student> student;
	public Department(int deptid, String deptName) {
		super();
		this.deptid = deptid;
		this.deptName = deptName;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
	
}
