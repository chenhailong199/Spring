package com.spring.service.impl;

import com.spring.dao.StudentDao;
import com.spring.entity.Student;
import com.spring.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentDao studentDao;
	
	public StudentServiceImpl() {
	}
	//set方法注入
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}


	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.saveStudent(student);
	}
	@Override
	public boolean removeStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.removeStudent(student);
	}

}
