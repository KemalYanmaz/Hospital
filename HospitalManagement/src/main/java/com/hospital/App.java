package com.hospital;

import com.hospital.business.abstracts.HospitalService;
import com.hospital.business.concretes.HospitalManager;
import com.hospital.entities.Employee;
import com.hospital.utils.Container;
import com.hospital.utils.GenderType;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        HospitalService hospitalService = Container.getHospitalService();
        hospitalService.openHospital();
        hospitalService.addEmployee(new Employee("Kemal","Yanmaz",23, GenderType.MALE, BigDecimal.valueOf(10)));
        hospitalService.addEmployee(new Employee("Ulaş","Yanmaz",24,GenderType.MALE,BigDecimal.valueOf(200)));

        hospitalService.payAllSalaries();
    }
}