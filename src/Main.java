//Actually using the method

public class Main {
    public static void main(String[] args){
        Employee employee1 = new Employee("John", "Smith", 1369, 3);
        Employee employee2 = new Employee("Sara", "Laughs", 1313, 2);
        Employee employee3 = new Employee("Jessic", "Rabbit", 2418, 1);

        employee1.printEmployee();
        System.out.println("\n");
        employee2.printEmployee();
        System.out.println("\n");
        employee3.printEmployee();

    }



}
