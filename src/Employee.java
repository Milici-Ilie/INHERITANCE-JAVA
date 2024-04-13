public class Employee extends Worker {

    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1;// ID creation STATIC 🆔🆔🆔🆔

    public Employee() {
    }// we created this CONSTRUCTOR to connect this file with "SalariedEmployee" file

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;//ID creation 🆔🆔🆔🆔
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }// now let's check the code in the "Main.java" file
}
