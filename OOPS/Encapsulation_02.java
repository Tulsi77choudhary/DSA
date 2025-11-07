package OOPS;

public class Encapsulation_02 {

    public static class Employee {

        private String name;
        private double salery;

        public String getname() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getsalery() {
            return salery;
        }

        public void setSalery(double salery) {
            this.salery = salery;
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Tulsi");
        employee.setSalery(5000);

        System.out.println("Name " + employee.getname());
        System.out.println("Salery " + employee.getsalery());


    }
}