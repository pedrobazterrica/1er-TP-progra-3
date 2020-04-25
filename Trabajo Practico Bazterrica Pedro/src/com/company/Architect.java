package com.company;

public class Architect extends Employee {

    private int enrollmentNumber;

    public Architect(){}

    public Architect(String name, int dni, int phoneNumber, int enrollmentNumber) {
        super(name, dni, phoneNumber);
        this.enrollmentNumber = enrollmentNumber;
        super.setDailyPayment(2000);
    }


    public void drawPlans(){
        System.out.println("Creando mi próximo plano");
    }

    @Override
    public String toString(){
        return "Arquitecto:[nombre:"+this.getName()+"/dni:"+this.getDni()+"/phoneNumber:"+this.getPhoneNumber()+"/Matricula:"+enrollmentNumber+"]";
    }
}
