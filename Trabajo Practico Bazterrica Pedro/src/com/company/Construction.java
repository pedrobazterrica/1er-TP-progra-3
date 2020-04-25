package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Construction{
    private String address;
    private int squareMeters;
    private int estimatedBuildTime; //in days
    private double costPerSquareMeter;
    private List<Employee> assignedStaff;

    protected Construction(){}

    protected Construction(String address, int squareMeters, int estimatedBuildTime, double costPerSquareMeter) {
        this.address = address;
        this.squareMeters = squareMeters;
        this.estimatedBuildTime = estimatedBuildTime;
        this.costPerSquareMeter = costPerSquareMeter;
        assignedStaff = new ArrayList<Employee>();
    }


    //Primero chequea arquitecto, dsp maestro y dsp obreros. Solo avisa el que falta que chequea primero
    public double getTotalCost(){
        double totalCost = 0;
        double dailyStaffCost = 0;
        if(checkAmountOfArchitect()==0){
            System.out.println("La obra aun no tiene arquitecto asignado...");
        }else if(checkAmountOfMasters()==0){
            System.out.println("La obra aun no tiene maestro mayor de obra");
        }else if(checkAmountOfWorkers()<2){
            System.out.println("La obra necesita al menos 2 obreros!");
        }else
        {
            for(Employee employee : assignedStaff){
                dailyStaffCost+=employee.getDailyPayment();
            }
            totalCost = (squareMeters*costPerSquareMeter)+(dailyStaffCost*estimatedBuildTime);
        }
        return totalCost;
    }

    private int checkAmountOfMasters(){
        int masterAmount = 0;
        for(Employee employee : assignedStaff){
            if(!(employee instanceof Worker) && (employee instanceof Master)){
                masterAmount++;
            }
        }
        return masterAmount;
    }

    private int checkAmountOfArchitect(){
        int ArchitectAmount = 0;
        for(Employee employee : assignedStaff){
            if(employee instanceof Architect){
                ArchitectAmount++;
            }
        }
        return ArchitectAmount;
    }

    private int checkAmountOfWorkers(){
        int workersAmount = 0;
        for(Employee employee : assignedStaff){
            if(employee instanceof Worker){
                workersAmount++;
            }
        }
        return workersAmount;
    }

    public void addEmployee(Employee newEmployee){
        if(newEmployee instanceof Worker){
            checkAndAddEmployee(newEmployee);
        }else if(newEmployee instanceof Master){
            if(checkAmountOfMasters()<3){
                checkAndAddEmployee(newEmployee);
            }else{
                System.out.println("CANNOT HAVE MORE THAN 3 MASTERS");
            }
        }else{
            if(checkAmountOfArchitect()==0){
                checkAndAddEmployee(newEmployee);
            }else{
                System.out.println("CANNOT HAVE MORE THAN 1 ARCHITECT");
            }
        }
    }

    private void checkAndAddEmployee(Employee newEmployee){
        if(checkIfEmployeeRepeats(newEmployee)){
            assignedStaff.add(newEmployee);
        }else{
            System.out.println("EMPLOYEE ALREADY IN LIST");
        }
    }

    private boolean checkIfEmployeeRepeats(Employee newEmployee){
        boolean rta = true;
        for(Employee employee : assignedStaff){
            if(employee.equals(newEmployee)){
                rta = false;
            }
        }
        return rta;
    }

    public void showEmployees(){
        for(Employee employee : assignedStaff){
            System.out.println(employee.toString());
        }
    }

}
