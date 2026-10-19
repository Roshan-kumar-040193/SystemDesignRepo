package src.main.java.org.example.InterfacesegregationPrinciple;

public class InterfaceSegregationPrinciple {

    //client should not be foreced to be dependent on method they don't use
    //divide the interfaces for optimization



}

interface Bird{
    //void fly(); this method will cause issue for flightless birds so better divide the original interface
    void eat();//all kind of birds can implement this
}

interface FlyingBirds extends Bird{
    @Override
    void eat();
    void fly();
}
interface FlightlessBirds extends Bird{
    @Override
    void eat();
    void walk();
}

class Penguin implements FlightlessBirds{

    @Override
    public void eat() {
        System.out.println("eats fish");
    }

    @Override
    public void walk() {
        System.out.println("walks on ice");
    }
}

class Albatros implements FlyingBirds{

    @Override
    public void eat() {
        System.out.println("Eats fish");
    }

    @Override
    public void fly() {
        System.out.println("One of the best flyers");
    }
}