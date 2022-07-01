package Records;

public class Records {

    public static void main(String[] args) {


        EmployeeClass employee = new EmployeeClass("John", 5001);
        System.out.println(employee);


        EmployeeRecord employee2 = new EmployeeRecord("Andy", 9941);
        System.out.println(employee2.nameInUpper());

        // static methods use the class name to call methods
        EmployeeRecord.printWhatever();
    }
}
