package com.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Employee> employeesList;
    private List<Construction> constructionsList;

    public Company(){}

    public Company(String name){
        this.name = name;
        employeesList = new ArrayList<Employee>();
        constructionsList = new ArrayList<Construction>();
    }


    public void addEmployee(Employee newEmployee){
        if(checkIfEmployeeRepeats(newEmployee)){
            employeesList.add(newEmployee);
        }else{
            System.out.println("EMPLOYEE ALREADY IN LIST");
        }
    }

    private boolean checkIfEmployeeRepeats(Employee newEmployee){
        boolean rta = true;
        for(Employee employee : employeesList){
            if(employee.equals(newEmployee)){
                rta = false;
            }
        }
        return rta;
    }

    public void addConstruction(Construction newConstruction){
        if(checkIfConstructionRepeats(newConstruction)){
            constructionsList.add(newConstruction);
        }else{
            System.out.println("CONSTRUCTION ALREADY IN LIST");
        }
    }

    private boolean checkIfConstructionRepeats(Construction newConstruction){
        boolean rta = true;
        for(Construction construction : constructionsList){
            if(construction.equals(newConstruction)){
                rta = false;
            }
        }
        return rta;
    }

    public void showEmployees(){
        System.out.println("----------------------");
        for(Construction construction : constructionsList){
            System.out.println(construction.toString());
            construction.showEmployees();
            System.out.println("----------------------");
        }
    }

    public void showConstructions(){
        System.out.println("----------------------");
        for(Construction construction : constructionsList){
            System.out.println(construction.toString());
            System.out.println("Costo total: "+construction.getTotalCost()+" pesos.");
            System.out.println("----------------------");
        }
    }
}
