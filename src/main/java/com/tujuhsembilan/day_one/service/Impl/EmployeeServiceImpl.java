package com.tujuhsembilan.day_one.service.Impl;

import com.tujuhsembilan.day_one.dto.EmployeeDto;
import com.tujuhsembilan.day_one.entity.Employee;
import com.tujuhsembilan.day_one.exception.ResourceNotFoudException;
import com.tujuhsembilan.day_one.mapper.EmployeeMapper;
import com.tujuhsembilan.day_one.repository.EmployeeRepository;
import com.tujuhsembilan.day_one.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> new ResourceNotFoudException("employee is not exists with given id: " + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
