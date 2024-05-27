package com.tujuhsembilan.day_one.service;

import com.tujuhsembilan.day_one.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long EmployeeId);
}
