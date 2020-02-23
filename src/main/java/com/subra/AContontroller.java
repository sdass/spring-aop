package com.subra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/* testing urls

curl -v -X DELETE "http://localhost:8080/remove/employee?empId=5"
C:\Temp\delete>curl "http://localhost:8080/add/employee?empId=5&name=Davis"
{"empId":5,"name":"Davis"}

 */

@RestController
public class AContontroller {

	@Autowired
	private AService aservice;
	
	@GetMapping("/add/employee")
	public Employee addEmployee(@RequestParam("empId") Integer empId, @RequestParam("name") String name) {
		Employee emp = aservice.createEmployee(name, empId);
		return emp;
	}
	
	@DeleteMapping("/remove/employee")
	public ResponseEntity<Integer> deleteEmployee(@RequestParam("empId") Integer empId) {
		int count = aservice.deleteEmployee(empId);
		ResponseEntity<Integer> resp = new ResponseEntity<>(count, HttpStatus.OK);
		return resp;
	}
}
