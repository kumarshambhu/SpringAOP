package com.shambhu.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LoggerAfterAdvice implements AfterReturningAdvice{

	//@Override
	public void afterReturning(Object arg0, Method method, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("**** Ending ********* : "+arg3.getClass().getSimpleName()+ " : "+method.getName());
		
	}

}
