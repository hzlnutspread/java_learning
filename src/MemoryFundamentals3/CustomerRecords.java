package MemoryFundamentals3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
    private Map<String, Customer> records;

    public CustomerRecords() {
        this.records = new HashMap<String, Customer>();
    }

    public void addCustomer(Customer c) {
        this.records.put(c.getName(), c);
    }

//    public Map<String, Customer> getCustomers() {
////      Pass the existing hashmap into the constructor of the new hashmap
////      We return a copy of the hashmap
//        return new HashMap<String, Customer>(this.records);
//    }

    public Map<String, Customer> getCustomers() {
//      Creates copy of original map that can't be edited
        return Collections.unmodifiableMap(this.records);
    }

    @Override
    public Iterator<Customer> iterator() {
//      Return what we want to iterate through (records) the values and call the .iterator() function
        return records.values().iterator();
    }

//  We have created an escaping reference to the customer object.
//  A client that calls getCustomerName will get a reference to the customer and can now call any of the methods on the customer object that change its values:
//      setName() method to change the customers name.
//  We don't want to allow this.
//    public Customer getCustomerByName(String name) {
////      Since we added a new constructor in Customer, we can pass in oldCustomer to get a copy
//        return new Customer(this.records.get(name));
//    }

    //  Utilizing the interface dont need to return a copy of the Customer
//  Return the current object from the collection
    public CustomerReadOnly getCustomerByName(String name) {
        return this.records.get(name);
    }
//  The client that calls this method will only see the CustomerReadOnly interface methods (getName and toString) and wont see the setName method.

}

// We want to make CustomerRecords an iterable class, and provide an iterator to the objects we want to iterate through
//      We want CustomerRecords to implement Interable<Customers>

// Once CustomerRecords is an iterable class, rather than using for (Customer next : records.getCustomers().values()):
//      Instead we can use, for each customer in records. I.E:
//      for (Customer next : records)

// Once we have the iterator, we can still call iterator().remove() which still mutates the underlying collection.
// Better solution could be to return a new instance of the collection

