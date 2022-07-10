package com.jjuanrgzu.employeemanager.dto;

import com.jjuanrgzu.employeemanager.entity.Employee;

public class EmployeeDTO {
	
	private Long id;
	private String name;
	private String email;
	private String jobTitle;
	private String phone;
	private String imgUrl;
	private String employeeCode;
	private String projectCode;
	
	public static EmployeeDTO toDTO(Employee entity) {
		
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmail(entity.getEmail());
		dto.setEmployeeCode(entity.getEmployeeCode());
		dto.setId(entity.getId());
		dto.setImgUrl(entity.getImgUrl());
		dto.setJobTitle(entity.getJobTitle());
		dto.setName(entity.getName());
		dto.setPhone(entity.getPhone());
		dto.setProjectCode(entity.getProjectCode());
		
		return dto;
		
	}
	
public static Employee toEntity(EmployeeDTO dto) {
		
		Employee entity = new Employee();
		entity.setEmail(dto.getEmail());
		entity.setEmployeeCode(dto.getEmployeeCode());
		entity.setId(dto.getId());
		entity.setImgUrl(dto.getImgUrl());
		entity.setJobTitle(dto.getJobTitle());
		entity.setName(dto.getName());
		entity.setPhone(dto.getPhone());
		entity.setProjectCode(dto.getProjectCode());
		
		return entity;
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	
}
