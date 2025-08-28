package com.sit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sit.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
