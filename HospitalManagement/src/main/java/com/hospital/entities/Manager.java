package com.hospital.entities;

import com.hospital.utils.GenderType;

import java.math.BigDecimal;

public class Manager extends Employee{
    public Manager(String firstName, String lastName, int age, GenderType gender, BigDecimal salary) {
        super(firstName, lastName, age, gender, salary);
    }
}
