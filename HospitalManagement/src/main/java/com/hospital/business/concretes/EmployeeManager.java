package com.hospital.business.concretes;

import com.hospital.business.abstracts.EmployeeService;
import com.hospital.entities.Employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager implements EmployeeService {
    private static final EmployeeManager INSTANCE = new EmployeeManager();
    private EmployeeManager(){}

    public static EmployeeManager getInstance(){return INSTANCE;}

    List<Employee> employees = new ArrayList<>();

    @Override
    public boolean addEmployee(Employee employee) {
        if(employee!=null){
            employees.add(employee);
            return true;
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public List<Employee> getEmployeesOfManager(String id) {
        return null;
    }

    @Override
    public BigDecimal getSalaries(List<Employee> employees) {
        return sumSalaries(employees);

    }

    @Override
    public BigDecimal getAllSalaries() {
        return sumSalaries(employees);
    }


    @Override
    public void paySalary(Employee employee) {

    }

    private BigDecimal sumSalaries(List<Employee> employees){
        double decimal=0;
        for(Employee employee:employees){
            decimal += employee.getSalary().doubleValue();
        }
        return BigDecimal.valueOf(decimal);
    }
}
