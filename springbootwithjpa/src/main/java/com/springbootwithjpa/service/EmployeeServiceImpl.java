package com.springbootwithjpa.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootwithjpa.dao.EmployeeRepository;
import com.springbootwithjpa.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Transactional
	@Override
	public Employee createEmployee(Employee employee) {
		this.employeeRepository.save(employee);
		return employee;
	}

	@Override
	public Employee readEmployeeById(int empId) {
		return employeeRepository.findByEmpId(empId);
		/*Optional<Employee> optional=employeeRepository.findById(empId);
		if(optional.isPresent())
		{
			optional.
		}*/
	
	}
	

	@Override
	public Employee updateEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee readEmployeeByName(String empName) {
		
		return this.employeeRepository.findByEmpName(empName);
	}

	@Override
	public List<Employee> readEmployees() {
		
		return this.employeeRepository.findAll();
	}

	@Override
	public Employee findByEmpIdAndEmpName(int empId, String empName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getValue(int id) {
		return employeeRepository.getValue(id);
	}

	@Override
	public Employee readByIdAndName(int empId, String empName) {
		return employeeRepository.findByEmpIdAndEmpName(empId, empName);
	}

	
	
	}

	
	
	

