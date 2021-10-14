package com.hospital.entities;

import com.hospital.utils.GenderType;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private GenderType gender;

    public Person(String firstName,String lastName,int age,GenderType gender){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setGender(gender);
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public GenderType getGender() {
        return gender;
    }

    private void setGender(GenderType gender) {
        this.gender = gender;
    }
}
