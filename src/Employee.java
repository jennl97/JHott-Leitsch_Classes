public class Employee {
    //Declare member variables

           public String firstName;
           public String lastName;
           public int employeeNumber;
           public int employeeShift;


    //Declare Method
           public Employee(String firstName, String lastName, int employeeNumber, int employeeShift){
               this.firstName = firstName;
               this.lastName = lastName;
               this.employeeNumber = employeeNumber;
               this.employeeShift = employeeShift;
           }
    //Overloading the method
               public String getFirstName() {
                   return firstName;
               }

               public void setFirstName(String firstName) {
                   this.firstName = firstName;
               }

               public String getLastName() {
                   return lastName;
               }

               public void setLastName(String lastName) {
                   this.lastName = lastName;
               }

               public int getEmployeeNumber() {
                   return employeeNumber;
               }

               public void setEmployeeNumber(int employeeNumber) {
                   this.employeeNumber = employeeNumber;
               }

               public int getEmployeeShift() {
                   return employeeShift;
               }

               public void setEmployeeShift(int employeeShift) {
                   this.employeeShift = employeeShift;
               }

               public void printEmployee(){
                    System.out.println("Employee: " + firstName + " " + lastName + "\nEmployee Number: " + employeeNumber + " " + "\nEmployee Shift: " + employeeShift);
               }
           }



