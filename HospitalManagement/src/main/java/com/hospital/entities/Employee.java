package com.hospital.entities;

import com.hospital.utils.GenderType;

import java.math.BigDecimal;

public class Employee extends Person{

    private BigDecimal salary;
    public Employee(String firstName, String lastName, int age, GenderType gender, BigDecimal salary) {
        super(firstName, lastName, age, gender);
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

}
