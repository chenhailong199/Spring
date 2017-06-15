package com.spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import com.spring.entity.Grade;
import com.spring.service.GradeService;


public class GradeTest {
	private ApplicationContext ctx;
	private GradeService gradeService;
	@Before
	public void before(){
		// 使用ApplicationContext接口的实现类ClassPathXmlApplicationContext加载Spring配置文件
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 通过ApplicationContext接口的getBean()方法获取id或name为studentServiceImpl的Bean实例
		gradeService = (GradeService) ctx.getBean("gradeService");
		
	}
	@Test
	public void saveGrade(){
		Grade grade = new Grade();
		gradeService.saveGrade(grade);
	}
	@Test
	public void print(){
		Grade grade = (Grade) ctx.getBean("grade");
		System.out.println(grade);
	}
	@Test
	public void sendMail(){
		StringUtils.isEmpty("");
		StringUtils.trimAllWhitespace(" dsf sdf ");
		
	}
}
