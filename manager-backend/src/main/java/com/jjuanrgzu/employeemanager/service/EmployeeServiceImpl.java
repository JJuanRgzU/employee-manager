package com.jjuanrgzu.employeemanager.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jjuanrgzu.employeemanager.dto.EmployeeDTO;
import com.jjuanrgzu.employeemanager.entity.Employee;
import com.jjuanrgzu.employeemanager.exception.EmployeeException;
import com.jjuanrgzu.employeemanager.repository.EmployeeRepository;

@Service(value = "employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDTO addEmployee(EmployeeDTO employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		Employee employeeToAdd = EmployeeDTO.toEntity(employee);
		return EmployeeDTO.toDTO(employeeRepository.save(employeeToAdd));
	}
	@Override
	public EmployeeDTO updateEmployee(EmployeeDTO employee) {
		Employee employeeToUpdate = EmployeeDTO.toEntity(employee);
		return EmployeeDTO.toDTO(employeeRepository.save(employeeToUpdate));
	}
	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}
	@Override
	public EmployeeDTO findEmployeeById(Long id) {
		Employee employeeFound = employeeRepository.findById(id)
				.orElseThrow(()->new EmployeeException("Service.EMPLOYEE_NOT_FOUND"));
		return EmployeeDTO.toDTO(employeeFound);
	}
	@Override
	public List<EmployeeDTO> findAllEmployees() {
		List<Employee> employeeList = employeeRepository.findAll();
		List<EmployeeDTO> employeeListDTO = employeeList.stream()
				.map(emp->EmployeeDTO.toDTO(emp))
				.collect(Collectors.toList());
		
		return employeeListDTO;
	}
}
