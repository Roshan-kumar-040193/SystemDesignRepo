//Derived class must be usable through the base interface
//the derived class must not reduce the functionality for base class
package org.example.LiskovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LiskovSubstitutionPrinciple {
}

interface ErrorVehical {
    public void showWheels();
    public void showEngine();
}

class Bike implements ErrorVehical{

    @Override
    public void showWheels() {
        System.out.println("It has 2 wheels");
    }

    @Override
    public void showEngine() {
        System.out.println("It has a motorcycle engine");
    }
}

class Car implements ErrorVehical{
    @Override
    public void showWheels() {
        System.out.println("It has 3 wheels");
    }

    @Override
    public void showEngine() {
        System.out.println("It has a Car engine");
    }
}

class Cycle implements ErrorVehical{
    @Override
    public void showWheels() {
        System.out.println("It has 3 wheels");
    }

    @Override
    public void showEngine()  {
        try {
            throw new Exception("Cycle has no engine");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Errortesting{
    ErrorVehical bike = new Bike();
    ErrorVehical car = new Car();
    ErrorVehical cyclle = new Cycle();

    ArrayList<ErrorVehical> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(cyclle);

    // Using forEach with lambda to display engine details
        vehicles.forEach(v -> v.showEngine());
}



interface Vehical {
    public void showWheels();
    //public void showEngine();
}

interface hasEngine{
    public void showEngine();
}

class Bike1 implements Vehical,hasEngine{

    @Override
    public void showWheels() {
        System.out.println("It has 2 wheels");
    }

    @Override
    public void showEngine() {
        System.out.println("It has a motorcycle engine");
    }
}

class Car1 implements Vehical,hasEngine{
    @Override
    public void showWheels() {
        System.out.println("It has 3 wheels");
    }

    @Override
    public void showEngine() {
        System.out.println("It has a Car engine");
    }
}

class Cycle1 implements Vehical{
    @Override
    public void showWheels() {
        System.out.println("It has 3 wheels");
    }

    @Override
    public void showEngine()  {
        try {
            throw new Exception("Cycle has no engine");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Testing{
    Vehical bike = new Bike1();
    Vehical car = new Car1();
    Vehical cyclle = new Cycle1();

    ArrayList<Vehical> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(cyclle);

    // Using forEach with lambda to display engine details
        vehicles.forEach(v -> v.showWheels());


    hasEngine bike1 = new Bike1();
    hasEngine car1 = new Car1();


    ArrayList<hasEngine> engiineVehicles = new ArrayList<>();
        engiineVehicles.add(car);
        engiineVehicles.add(bike);

    // Using forEach with lambda to display engine details
        vehicles.forEach(v -> v.showEngine());



}



