DROP DATABASE if EXISTS employeemanagement;
CREATE DATABASE employeemanagement;
USE employeemanagement;

CREATE TABLE `employeemanagement`.`employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `job_title` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  `img_url` VARCHAR(45) NULL,
  `employee_code` VARCHAR(45) NULL,
  `project_code` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
  UNIQUE INDEX `employee_code_UNIQUE` (`employee_code` ASC) VISIBLE,
  UNIQUE INDEX `phone_UNIQUE` (`phone` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);
