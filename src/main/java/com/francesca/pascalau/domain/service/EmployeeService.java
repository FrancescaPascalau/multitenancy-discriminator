package com.francesca.pascalau.domain.service;

import com.francesca.pascalau.data.entities.Employee;
import com.francesca.pascalau.data.repositories.EmployeeRepository;
import com.francesca.pascalau.data.repositories.TenantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;

    public List<Employee> findEmployees() {
        return repository.findAll();
    }
}