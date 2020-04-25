package com.company;

public abstract class Employee {
    private String name;
    private int dni;
    private int phoneNumber;
    private int dailyPayment;

    protected Employee(){}

    protected Employee(String name, int dni, int phoneNumber) {
        this.name = name;
        this.dni = dni;
        this.phoneNumber = phoneNumber;
    }

    protected void setDailyPayment(int dailyPayment) {
        this.dailyPayment = dailyPayment;
    }

    public int getDailyPayment() {
        return dailyPayment;
    }

    public String getName() {
        return name;
    }

    public int getDni() {
        return dni;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
