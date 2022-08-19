package MemoryFundamentals3;

public class Customer implements CustomerReadOnly {
    private String name;
//  Private fields + get and set methods means its difficult for someone to accidentally change the value of the fields

    // We dont need to worry about references to immutable objects.
    // This returns a reference to the String containing the name of the customer. Not a problem because Strings are immutable.
    //      Value can't be changed.
    //      When we change the string to something else, a new object is created on the head and the reference is changed to the new object.
    //      Original object is garbage collected.
    @Override
    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }

    //  Now if we call this customer constructor, we will get a new Customer object which won't be a reference to the existing one.
//  Will contain the same data.
    public Customer(Customer oldCustomer) {
        this.name = oldCustomer.name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// We are able to avoid the escaping reference by creating a copy of original object by using the special constructor:
//      This enabled us to pass in the existing instance of the object that we are trying to copy

// But we can still mutate the copy, because the client might think its changing the original copy.

// If the customer Ojbect had a private field that was a pointer to another object, then changing the object that we're pointing to could cause damag ein the original class.
//      Can only provide a fool-proof fix if we can provide a read-only version of the Customer.
//      Can do this using interfaces.

// So to use interfaces, we extract the interface for both getName and toString and within the CustomerRecords class, instead of returning an instance of the Customer,
// We return CustomerReadOnly

// We dont need to worry about references to immutable objects.

