package com.company;

public class Worker extends Master {

    public Worker(){

    }

    public Worker(String name, int dni, int phoneNumber, int age) {
        super(name, dni, phoneNumber, age);
        super.setDailyPayment(1500);
    }

    @Override
    public void work(){
        System.out.println("Soy obrero y construyo");
    }

    @Override
    public String toString(){
        return "Obrero:[nombre:"+this.getName()+"/dni:"+this.getDni()+"/phoneNumber:"+this.getPhoneNumber()+"/Edad:"+this.getAge()+"]";
    }
}
