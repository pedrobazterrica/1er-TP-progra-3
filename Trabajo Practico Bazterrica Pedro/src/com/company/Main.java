package com.company;

public class Main {

    public static void main(String[] args) {
        //Empresa...
        Company empresa = new Company("LA EMPRESA MAS PRO");
        //Empleados...
        Architect arquitecto1 = new Architect("Juan",40512431,15431214,1);
        Architect arquitecto2 = new Architect("Pablo",42134516,15423415,2);
        Master maestro1 = new Master("Jose",24561613,154234561,34);
        Master maestro2 = new Master("Ruben",24615315,15542153,36);
        Master maestro3 = new Master("Gianluca",13541241,15315151,42);
        Worker obrero1 = new Worker("Ignacio",14315421,154613541,50);
        Worker obrero2 = new Worker("Francisco",31542154,15424251,25);
        Worker obrero3 = new Worker("Lautaro",12515452,15321541,60);
        //Obras...
        Commerce comercio = new Commerce("Tucuman 3311",210,365,25,"La Floreria","Jardineria");
        Home casa = new Home("Peña 1645",50,720,70,3);
        Hotel hotel = new Hotel("Alem 124",30,650,120,"Gran Hotel",6);
        //Agrego todos los empleados a la empresa...
        empresa.addEmployee(arquitecto1);
        empresa.addEmployee(arquitecto2);
        empresa.addEmployee(maestro1);
        empresa.addEmployee(maestro2);
        empresa.addEmployee(maestro3);
        empresa.addEmployee(obrero1);
        empresa.addEmployee(obrero2);
        empresa.addEmployee(obrero3);
        //Agrego empleados a obras...
        casa.addEmployee(arquitecto1);
        casa.addEmployee(maestro1);
        casa.addEmployee(obrero1);
        casa.addEmployee(obrero2);
        hotel.addEmployee(arquitecto2);
        hotel.addEmployee(maestro2);
        hotel.addEmployee(obrero2);
        hotel.addEmployee(obrero3);
        comercio.addEmployee(arquitecto2);
        comercio.addEmployee(maestro3);
        comercio.addEmployee(obrero3);
        comercio.addEmployee(obrero1);
        //Agrego obras a empresa...
        empresa.addConstruction(comercio);
        empresa.addConstruction(casa);
        empresa.addConstruction(hotel);
        //Pruebo metodos de cada empleado...
        arquitecto1.drawPlans();
        maestro1.work();
        obrero1.work();
        //Muestro empleados por obra
        empresa.showEmployees();
        //Calculo y muestro costo por obra
        empresa.showConstructions();
        //Te muestro que no se puede agregar mas que un arquitecto...
        casa.addEmployee(arquitecto2);
        //Tambien esta para maestro pero me da fiaca mostrarlo...
        //Te muestro que no se puede calcular costos sin un arquitecto o maestro...
        Home casa2 = new Home("RPeña 165",30,65,10,3);
        casa2.addEmployee(obrero3);
        System.out.println(casa2.getTotalCost());
        casa2.addEmployee(arquitecto2);
        //Igual que maestro...
        System.out.println(casa2.getTotalCost());
        //Igual que no tener al menos 2 obreros...
        casa2.addEmployee(maestro2);
        System.out.println(casa2.getTotalCost());

    }
}
