package Records;

public record EmployeeRecord (String name, int employeeNumber) implements Runnable {

    // private fields for all components listed. Generated as final fields and cant be changed
    // generates public getter methods, but dont have 'get' in method name.
    // does the same as the EmployeeClass basically


    // automatically generates toString, equals and hashCode methods

    // does not generate setter methods
    // Record classes are immutable (record object cant be changed once created)

    // records can't extend any other class. implicitly extends the record class.
    // records are implicitly final classes
    // you CAN implement interfaces


    // can create static fields like any other class
    public static final String DEFAULT_EMPLOYEE_NAME = "George";


    // generates a certain type of constructor.
    // Creates a constructor that takes in as parameters the components you listed in the record declaration above.
    // Then sets the records fields with the values in the parameters.
    // Its a canonical constructor
    // you can define your own constructors though. You can override it with your own implementation
    // has to be in the exact same order
    public EmployeeRecord(String name, int employeeNumber) {
        if (employeeNumber < 0) {
            throw new IllegalArgumentException("Cant be negative");
        }
        this.name = name;
        this.employeeNumber = employeeNumber;
    }
    // a compact constructor can also be used where you remove the parameters of the constructor and the this.name/this.employeeNumber fields.
    // unique to records. Will look like this:
//    public EmployeeRecord {
//        if (employeeNumber < 0) {
//            throw new IllegalArgumentException("Cant be negative");
//        }
//    }


    // cant do this because that needs to be defined up the top when you declare the record
    // private String something;

    public String nameInUpper() {
        return name.toUpperCase();
    }

    public static void printWhatever() {
        System.out.println("whatever...");
    }

    @Override
    public void run() {

    }
}
