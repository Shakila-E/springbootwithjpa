package com.springbootwithjpa.service;

import java.util.List;

import com.springbootwithjpa.model.Employee;

public interface EmployeeService {

	public  Employee createEmployee(Employee employee);
	public  Employee readEmployeeById(int empId);
	public  Employee updateEmployee(Employee employee);
	public  Employee deleteEmployeeById(int empId);
	public Employee readEmployeeByName(String empName);
	public List<Employee> readEmployees();
	public Employee findByEmpIdAndEmpName(int empId,String empName);
	public Employee getValue(int id);
	public Employee readByIdAndName(int empId, String empName);
}
