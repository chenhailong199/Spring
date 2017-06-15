package com.spring.logger;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author Administrator
 * @category 实现 MethodBeforeAdvice 添加增强
 */
public class ServiceBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("方法名:"+arg0.getName());
	}

}
