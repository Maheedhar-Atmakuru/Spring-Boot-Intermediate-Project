package com.example.jpa.services;

import com.example.jpa.entities.EmployeeEntity;
import com.example.jpa.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity getEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }


    public EmployeeEntity save(EmployeeEntity inputEmployee) {
        return employeeRepository.save(inputEmployee);
    }
}
