package com.springbootwithjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springbootwithjpa.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
public Employee findByEmpId(int empId);
public Employee findByEmpName(String empName);
public List<Employee> findAll();
public Employee findByEmpIdAndEmpName(int empId,String empName);
@Query("from Employee e where e.empId=id")
public Employee getValue(int id);
	
}
