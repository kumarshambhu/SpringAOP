package com.shambhu.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggerAroundAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		System.out.println("Method name : "
				+ methodInvocation.getMethod().getName());
		System.out.println("Method arguments : "
				+ Arrays.toString(methodInvocation.getArguments()));

		
		System.out.println("LoggerAroundAdvice : Before method call!");

		try {
			// original method call
			Object result = methodInvocation.proceed();

			// same with After ReturningAdvice
			System.out.println("LoggerAroundAdvice : After method call!");

			return result;

		} catch (IllegalArgumentException e) {
			// same with ThrowsAdvice
			System.out
					.println("LoggerAroundAdvice : Throw exception !");
			throw e;
		}
	}
}
