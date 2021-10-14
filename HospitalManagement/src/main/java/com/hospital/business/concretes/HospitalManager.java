package com.hospital.business.concretes;

import com.hospital.business.abstracts.EmployeeService;
import com.hospital.business.abstracts.HospitalService;
import com.hospital.business.abstracts.PatientService;
import com.hospital.entities.Employee;
import com.hospital.entities.Hospital;
import com.hospital.entities.Patient;
import com.hospital.utils.Container;

import java.math.BigDecimal;
import java.util.List;

public class HospitalManager implements HospitalService {

    private EmployeeService employeeService;
    private PatientService patientService;
    private Hospital hospital;

    private HospitalManager(Hospital hospital,EmployeeService employeeService,PatientService patientService){
        this.hospital = hospital;
        this.employeeService = employeeService;
        this.patientService = patientService;
    }

    public static HospitalManager getInstance(){
        return new HospitalManager(Container.getHospital(),Container.getEmployeeService(),Container.getPatientService());
    }

    @Override
    public void paySalary(Employee employee) {
        employeeService.paySalary(employee);
    }

    @Override
    public boolean paySalaries(List<Employee> employees) {
        hospital.paySalaries(employeeService.getSalaries(employees));
        return true;
    }

    @Override
    public void payAllSalaries() {
        hospital.paySalaries(employeeService.getSalaries(employeeService.getAllEmployees()));

    }

    public BigDecimal getBudget(){
        return hospital.getBudget();
    }
    @Override
    public void openHospital() {
        Container.getHospital().openHospital();
    }

    @Override
    public void closeHospital() {
        Container.getHospital().closeHospital();
    }

    @Override
    public void acceptPatient(Patient patient) {

    }

    @Override
    public void dischargePatient(Patient patient) {

    }

    @Override
    public void addEmployee(Employee employee) {
        employeeService.addEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
