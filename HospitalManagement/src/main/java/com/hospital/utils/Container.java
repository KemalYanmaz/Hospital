package com.hospital.utils;

import com.hospital.business.abstracts.EmployeeService;
import com.hospital.business.abstracts.HospitalService;
import com.hospital.business.abstracts.PatientService;
import com.hospital.business.concretes.EmployeeManager;
import com.hospital.business.concretes.HospitalManager;
import com.hospital.business.concretes.PatientManager;
import com.hospital.entities.Hospital;
import com.hospital.entities.Manager;

import java.math.BigDecimal;

public class Container {
    //Configs
    public static final String HOSPITAL_NAME = "ATATÜRK";
    public static final BigDecimal HOSPITAL_BUDGET = BigDecimal.valueOf(1000);
    public static final Manager MANAGER = new Manager("SS","ss",32,GenderType.FEMALE,BigDecimal.valueOf(1000));


    public static HospitalService getHospitalService(){
        return HospitalManager.getInstance();
    }
    public static EmployeeService getEmployeeService() { return EmployeeManager.getInstance();}
    public static PatientService getPatientService(){ return PatientManager.getInstance();}
    public static Hospital getHospital(){ return Hospital.getInstance();}
    public static String getHospitalName(){ return HOSPITAL_NAME;}
    public static BigDecimal getHospitalBudget(){ return HOSPITAL_BUDGET;}
    public static Manager getManager(){return MANAGER;}

}
