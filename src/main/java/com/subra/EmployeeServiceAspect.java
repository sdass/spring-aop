package com.subra;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeServiceAspect {

	@Before(value = "execution(* com.subra.AService.*(..)) and args(name, id)")
	public void beforeAdvice(JoinPoint joinPoint, String name, Integer id) {
		System.out.println("^^^^Before method: " + joinPoint.getSignature());
		System.out.println("creating employee with name" + name + " id=" + id);		
	}
	@After(value = "execution(* com.subra.AService.*(..)) and args(name, id)")
	public void afterAdvice(JoinPoint joinPoint, String name, Integer id) {
		System.out.println("VVVV--After method: " + joinPoint.getSignature());
		System.out.println("created employee with name" + name + " id=" + id);
		
	}
}
