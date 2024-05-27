package com.tujuhsembilan.day_one.repository;

import com.tujuhsembilan.day_one.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
