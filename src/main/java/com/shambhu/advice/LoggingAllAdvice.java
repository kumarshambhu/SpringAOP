package com.shambhu.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
/**
 * 
 * @author Shambhu
 * 
 * This class implements before and after advice together
 *
 */
public class LoggingAllAdvice implements MethodBeforeAdvice,AfterReturningAdvice{

	/**
	 * MethodBeforeAdvice Interface has one method which is implemented here
	 */
	
	public void before(Method method, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("**** Starting ********* : "+arg2.getClass().getSimpleName()+ " : "+method.getName());
		
	}

	/**
	 * AfterReturningAdvice Interface has one method which is implemented here 
	 */
	public void afterReturning(Object arg0, Method method, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("**** Ending ********* : "+arg3.getClass().getSimpleName()+ " : "+method.getName());
	}

}
