package ThisKeyword;

public class Dog {

    private String name;
    private int age;

    public Dog() {
        this("Jerry", 0);        // 'this' calls the below constructor based on the things we've passed in. Used for default objects
    }                                      // this calls the other constructor. Must be the very first line in the constructor

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;     // this.name and this.age refer to the name and age fields on the Dog object being created in the constructor
    }

    public static void printStuff() {
        // can't you 'this' in a static context
        // don't need a particular object, but 'this' refers to an object
    }

    public void setName(String name) {
        this.name = name;   // this.name specified to java that we are referring to the field on the object that this method was called on
    }                       // this.name refers to the field name 'private string name;' above


    public String getName() {
        return this.name;   // no other possibility. this.name refers to the field in the class above.
    }

    public void bark() {
        System.out.println("bark!");
    }
}
