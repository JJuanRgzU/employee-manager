package com.jjuanrgzu.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jjuanrgzu.employeemanager.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
