package com.subra;

import org.springframework.stereotype.Service;

@Service
public class AService {

	public Employee createEmployee(String name, Integer id) {
		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmpId(id);
		System.out.println("employee created...");
		return emp;
		
	}
	
	public int deleteEmployee(Integer id) {

		System.out.println("employee deleted..." + id);
		return 1;
		
	}
	
}
