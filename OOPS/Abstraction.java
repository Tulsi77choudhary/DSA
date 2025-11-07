package OOPS;

public class Abstraction {
    public static void main(String[] args) {
       Vehicle  myCar = new Car();
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();
        
    }
    
}

abstract class  Vehicle {
    abstract void accelerate();
    abstract void brake();

    void startEngine(){
        System.out.println("Engine started!");
    }
}

class Car extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("Car is accelerating...");
    }

    @Override
    void brake() {
        System.out.println("Car is braking...");
    }

    
}
