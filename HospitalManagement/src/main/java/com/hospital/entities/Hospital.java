package com.hospital.entities;

import com.hospital.utils.Container;
import com.hospital.utils.Payment;
import com.hospital.utils.Printer;

import java.math.BigDecimal;

public class Hospital {
    private static final Hospital INSTANCE = new Hospital(Container.getHospitalName(),Container.getHospitalBudget(),Container.getManager());
    private String name;
    private BigDecimal budget;
    private Manager manager;
    private boolean open;

    private Hospital(String name,BigDecimal budget,Manager manager){
        setName(name);
        setBudget(budget);
        setManager(manager);
    }

    public static Hospital getInstance(){
        return INSTANCE;
    }

    public void openHospital(){
        if(!open){
            open = true;
            System.out.println("The "+name+" hospital has opened.");
        }
    }

    public void closeHospital(){
        if(open){
            open = false;
            System.out.println("The "+name+" hospital has closed.");
        }
    }

    public boolean isOpen(){
        return open;
    }


    public boolean paySalaries(BigDecimal salariesTotal){
        if(this.budget.compareTo(salariesTotal)==1){
            System.out.println(Printer.tabbedPrint(1,salariesTotal.toString()+" € salary payment done."));
            System.out.println(Printer.tabbedPrint(1,"PreBudget: "+ Payment.toMoneyString("€",this.budget)));
            this.budget = this.budget.subtract(salariesTotal);
            System.out.println(Printer.tabbedPrint(1,"Payment: "+Payment.toMoneyString("€",salariesTotal)));
            System.out.println(Printer.tabbedPrint(1,"PostBudget: "+Payment.toMoneyString("€",this.budget)));
            return true;
        }else{
            throw new ArithmeticException("Böyle bir paramız yok");
        }
    }
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    private void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public Manager getManager() {
        return manager;
    }

    private void setManager(Manager manager) {
        this.manager = manager;
    }
}
