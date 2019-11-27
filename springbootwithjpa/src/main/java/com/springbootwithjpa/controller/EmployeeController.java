package com.springbootwithjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootwithjpa.model.Employee;
import com.springbootwithjpa.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value="/create")
	public Employee createOperation(@RequestBody Employee employee)
	
	{
		return this.employeeService.createEmployee(employee);
		
	}
	@GetMapping(value="/readbyempid/{abc}")
	public Employee readUserById(@PathVariable("abc") int empId )
	{
		
	     return employeeService.readEmployeeById(empId);
	}
	@GetMapping(value="/readbyempname/{abc}")
	public Employee readUserByName(@PathVariable("abc") String empName )
	{
		
	     return this.employeeService.readEmployeeByName(empName);
	}
	@GetMapping(value="/readall")
	public List<Employee> readAll()
	{
		
	     return this.employeeService.readEmployees();
	}
	@GetMapping(value="/readbyidandname/{param1}/{param2}")
	public Employee readByIdAndName(@PathVariable("param1") int empId,@PathVariable("param2") String empName)
	{
		return this.employeeService.readByIdAndName(empId,empName);
	}
	@GetMapping(value="/custom/{efg}")
	public Employee custom(@PathVariable("efg")int id)
	{
		
	     return employeeService.getValue(id);
	}
}
