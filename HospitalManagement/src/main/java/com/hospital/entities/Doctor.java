package com.hospital.entities;

import com.hospital.utils.GenderType;

import java.math.BigDecimal;

public class Doctor extends Employee{
    public Doctor(String firstName, String lastName, int age, GenderType gender, BigDecimal salary) {
        super(firstName, lastName, age, gender, salary);
    }
}
