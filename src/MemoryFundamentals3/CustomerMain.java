package MemoryFundamentals3;

public class CustomerMain {
    public static void main (String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));

//      If we run this on a Collections.unmodifyableMap we get runtime error since you can't change it.
        //records.getCustomers().clear();

        for (Customer next : records) {
            System.out.println(next);
        }
        System.out.println("------------------");

//      When we print out this John, it should be a copy of the existing customer.
//      Shouldn't effect the original John in the original list.
//        Customer john = records.getCustomerByName("John");

        CustomerReadOnly john = records.getCustomerByName("John");
        System.out.println(john.getName());
        System.out.println("------------------");


//      Set the name of the COPY of "john" to "dereK" (not the original data)
//        no setName in the CustomerReadOnly interface so there an error here. Could still cast the CustomerReadOnly into a Customer to change it though.
//        But it stops someone accidentally changing it
//        john.setName("Derek");
        System.out.println(john.getName());
        System.out.println("------------------");


//      Print out our original list again to make sure the setName() method above hasn't changed the original data
        for (Customer next : records) {
            System.out.println(next);
        }
    }

}

// If we are to call records.getCustomers().clear(), we can predict that it wont affect the original data
//      Because when we call .getCustomers() we are creating a copy of the original data (passing in original data)
//      This means we are only clearing the copy.

