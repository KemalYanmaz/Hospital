package com.hospital.business.abstracts;

import com.hospital.entities.Employee;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeService {
    boolean addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    List<Employee> getEmployeesOfManager(String id);

    BigDecimal getSalaries(List<Employee> employees);

    BigDecimal getAllSalaries();
    void paySalary(Employee employee);
}
