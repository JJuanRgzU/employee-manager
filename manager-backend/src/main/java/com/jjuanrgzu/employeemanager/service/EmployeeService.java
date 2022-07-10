package com.jjuanrgzu.employeemanager.service;

import java.util.List;

import com.jjuanrgzu.employeemanager.dto.EmployeeDTO;

public interface EmployeeService {
	EmployeeDTO addEmployee(EmployeeDTO employee);
	EmployeeDTO updateEmployee(EmployeeDTO employee);
	void deleteEmployee(Long id);
	EmployeeDTO findEmployeeById(Long id);
	List<EmployeeDTO> findAllEmployees();
}
