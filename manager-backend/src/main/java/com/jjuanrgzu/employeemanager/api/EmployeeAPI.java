package com.jjuanrgzu.employeemanager.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jjuanrgzu.employeemanager.dto.EmployeeDTO;
import com.jjuanrgzu.employeemanager.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
@Validated
public class EmployeeAPI {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value = "/add")
	public ResponseEntity<EmployeeDTO> addEmployee(@RequestBody EmployeeDTO employee) {
		EmployeeDTO employeeAdded = employeeService.addEmployee(employee);
		return new ResponseEntity<>(employeeAdded,HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/update")
	public ResponseEntity<EmployeeDTO> updateEmployee(EmployeeDTO employee) {
		EmployeeDTO employeeUpdated = employeeService.updateEmployee(employee);
		return new ResponseEntity<>(employeeUpdated,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<EmployeeDTO> findEmployeeById(Long id) {
		EmployeeDTO employeeFound = employeeService.findEmployeeById(id);
		return new ResponseEntity<>(employeeFound,HttpStatus.OK);
	}
	
	@GetMapping(value = "/get")
	public ResponseEntity<List<EmployeeDTO>> findAllEmployees() {
		List<EmployeeDTO> employeeList = employeeService.findAllEmployees();
		return new ResponseEntity<>(employeeList,HttpStatus.OK);
	}
}
