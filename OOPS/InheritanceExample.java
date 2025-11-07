package OOPS;

// Parent class

// Main class
public class InheritanceExample {
    static class Employee {
        String name;
        double salary;

        void work() {
            System.out.println(name + " is working...");
        }

        void showDetails() {
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
        }
    }

    // Child class
    static class Manager extends Employee {
        String department;

        void manageTeam() {
            System.out.println(name + " manages the " + department + " department.");
        }
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Tulsi";
        m.salary = 50000;
        m.department = "IT";

        m.showDetails();
        m.work(); 
        m.manageTeam(); // from Manager
    }
}
