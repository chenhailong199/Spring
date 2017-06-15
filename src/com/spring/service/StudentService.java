package com.spring.service;

import com.spring.entity.Student;

public interface StudentService {
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
