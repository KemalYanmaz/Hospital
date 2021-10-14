package com.hospital.business.abstracts;

import com.hospital.entities.Employee;
import com.hospital.entities.Patient;

import java.math.BigDecimal;
import java.util.List;

public interface HospitalService {

    EmployeeService employeeService = null;

    void paySalary(Employee employee);

    boolean paySalaries(List<Employee> employees);

    void payAllSalaries();
    BigDecimal getBudget();
    void openHospital();

    void closeHospital();

    void acceptPatient(Patient patient);

    void dischargePatient(Patient patient);

    void addEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
