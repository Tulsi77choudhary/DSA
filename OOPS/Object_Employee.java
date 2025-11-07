package OOPS;

// Object problem

public class Object_Employee {

    private String name;
    private float salary;

    public Object_Employee(String name , float salary){
        this.name = name;
        this.salary= salary;
    }

    public String getName(){
        return name;
    }
    public float getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
     public void displayDetails(){
        System.out.println(name);
        System.out.println(salary);
     }

    public static void main(String[] args) {
        Object_Employee emp = new Object_Employee("tulsi",10000.0f );
        emp.displayDetails();
    }
    
}
