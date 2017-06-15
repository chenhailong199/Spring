package com.spring.service.impl;



import com.spring.dao.GradeDao;
import com.spring.entity.Grade;
import com.spring.service.GradeService;

/**
 * @author Administrator
 * 
 */
public class GradeServiceImpl implements GradeService{
	private GradeDao gradeDao;
	public GradeServiceImpl() {
	
	}
	//构造方法注入
	public GradeServiceImpl(GradeDao gradeDao) {
		this.gradeDao = gradeDao;
	}

	@Override
	public void saveGrade(Grade grade) {
		// TODO Auto-generated method stub
		gradeDao.saveGrade(grade);
	}
	
}
