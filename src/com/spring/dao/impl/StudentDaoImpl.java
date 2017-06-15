package com.spring.dao.impl;

import com.spring.dao.StudentDao;
import com.spring.entity.Student;

public class StudentDaoImpl implements StudentDao{

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("新增学生方法");
	}

	@Override
	public boolean removeStudent(Student student) {
		System.out.println("删除成功");
		return true;
	}
	
}
