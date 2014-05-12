package com.shambhu.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggerBeforeAdvice implements MethodBeforeAdvice{

	//@Override
	public void before(Method method, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("**** Starting ********* : "+arg2.getClass().getSimpleName()+ " : "+method.getName());
	}

}
