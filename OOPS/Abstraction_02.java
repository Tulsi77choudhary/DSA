package OOPS;

abstract class Animal {
    void sound(){
        System.out.println("Dog barks: Woof Woof!");
    }
    
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class Abstraction_02 {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Object
        Animal cat = new Cat();

        dog.sound();
        cat.sound();
    }

}
