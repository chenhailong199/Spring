package com.spring.dao;

import com.spring.entity.Student;

public interface StudentDao {
	/**
	 * 保存
	 * @param student
	 */
	void saveStudent(Student student);
	
	/**
	 * 删除
	 * @param student
	 * @return
	 */
	boolean removeStudent(Student student);
}
