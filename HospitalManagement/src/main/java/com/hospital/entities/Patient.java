package com.hospital.entities;

import com.hospital.utils.GenderType;

public class Patient extends Person{
    public Patient(String firstName, String lastName, int age, GenderType gender) {
        super(firstName, lastName, age, gender);
    }
}
