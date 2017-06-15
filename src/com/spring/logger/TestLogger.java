package com.spring.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author Administrator
 * 切面类
 */
public class TestLogger {
	public void beforeLogger(JoinPoint jp){
		System.out.println("执行方法的实现类-->jp.getTarget():"+jp.getTarget()+			
					"\n方法的参数-->jp.getArgs()[0]:"+jp.getArgs()[0]+
					"\n执行方法的名称-->jp.getSignature().getName():"+jp.getSignature().getName()+
					"\n执行方法的接口-->getDeclaringTypeName:"+jp.getSignature().getDeclaringTypeName());
		System.out.println("aop:before开始执行方法----------->");
		
	}
	public void afterReturningLogger(JoinPoint jp, Object result){
		
		System.out.println("aop:after-returning方法执行完毕--------------->");
		System.out.println("方法返回的值:"+result);
	}
	public void afterLogger(){
		System.out.println("aop:after方法执行完毕--------------->");
	}
	public void afterThrowing(){
		System.out.println("after-throwing 方法");
	}
	
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("aop:around 方法");
		System.out.println("aop:around 目标方法前执行----------------->");
		pjp.proceed();
		System.out.println("aop:around 目标方法后执行----------------->");
	}
	public void saveStudentBefore(){
		System.out.println("指定saveStudent()方法前执行");
	}
}
