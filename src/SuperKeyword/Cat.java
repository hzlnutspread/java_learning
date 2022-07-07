package SuperKeyword;

public class Cat extends Animal {
    // Animal is the super class of cat
    // You will use super keyword to access things in the Animal class

    // Two ways to use super keyword
    // 1. To call methods in the super class that you've overridden in the child class
    // 2. Call parent class's constructors.

    String catFoodPreference;

    public Cat(int age, String name, String catFoodPreference) {    // If you dont use super, java automatically uses the no args constructor super();
        // If you dont have a no args constructor in the parent class you'll get an error
        super(age, name);       // Use super keyword here to avoid having to set this.name = name
        // Can only be used in subclass's constructor
        // Has to be the very first line of the constructor
        this.catFoodPreference = catFoodPreference;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();              // The super keyword calls the parent class implementation of the method
        System.out.println("Meow!");
    }

    public void jump() {
        super.makeNoise();      // You can still call the parent method anywhere. Generally dont though
    }

}