package com.example.gtics231lab5_20170404.repository;

import com.example.gtics231lab5_20170404.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
