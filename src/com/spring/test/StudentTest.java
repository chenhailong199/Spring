package com.spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entity.Student;
import com.spring.service.StudentService;

public class StudentTest {
	private ApplicationContext ctx;
	private StudentService studentService;
	@Before
	public void before(){
		// 使用ApplicationContext接口的实现类ClassPathXmlApplicationContext加载Spring配置文件
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 通过ApplicationContext接口的getBean()方法获取id或name为studentServiceImpl的Bean实例
		studentService = (StudentService) ctx.getBean("studentService");
		
	}
	@Test
	public void saveStudent(){
		// 通过ApplicationContext接口的getBean()方法获取id或name为student的Bean实例
		//Student student = (Student) ctx.getBean("student");
		Student student = new Student();
		studentService.saveStudent(student);
	}
	@Test
	public void removeStudent(){
		Student student = new Student();
		boolean flag = studentService.removeStudent(student);
		System.out.println(flag);
	}
}
