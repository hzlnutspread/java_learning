package Constructors;

public class Dog {
    // Constructor is a special type fo method to create new objects
    // can have multiple constructors with different parameter types

    // if we dont create any constructor AT ALL, then java uses default no args constructor. Will have to define it yourself

    String name;
    int age;

    public Dog(String name) { // no return type
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
