package com.company;

public class Master extends Employee {

    private int age;

    public Master(){}

    public Master(String name, int dni, int phoneNumber, int age) {
        super(name, dni, phoneNumber);
        this.age = age;
        super.setDailyPayment(1800);
    }

    public int getAge() {
        return age;
    }

    public void work() {
        System.out.println("Soy maestro y superviso las construcciones");
    }

    @Override
    public String toString(){
        return "Maestro:[nombre:"+this.getName()+"/dni:"+this.getDni()+"/phoneNumber:"+this.getPhoneNumber()+"/Edad:"+age+"]";
    }
}
