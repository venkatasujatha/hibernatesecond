package com.tec.HibernateSecond;

import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;

public class HiberDemo {

	public static void main(String[] args) 
	{
		
		
		Session session1 = new org.hibernate.cfg.Configuration().configure().buildSessionFactory().openSession();
		Student s=new Student();
		s.setId(501);
		s.setName("sujatha");
		Student s1=new Student();
		s1.setId(502);
		s1.setName("bharathi");
		Student s3=new Student();
		s3.setId(503);
		s3.setName("chinni");
		Department dept=new Department();
		dept.setDeptid(1);
		dept.setDeptName("cse");
		Department dept1=new Department();
		dept1.setDeptid(2);
		dept1.setDeptName("ece");
		
		List<Student> student=new ArrayList<Student>();
		student.add(s1);
		student.add(s1);
		student.add(s3);
		
		List<Department> list=new ArrayList<Department>();
		list.add(dept);
		list.add(dept1);
		
		s1.setDepartment(list);
		dept1.setStudent(student);
		Transaction tx=session1.beginTransaction();
			
		session1.save(s);
		session1.save(s1);
		session1.save(s3);
		
		session1.save(dept);
		session1.save(dept1);
		tx.commit();
				
		session1.close();
		
	}

}
