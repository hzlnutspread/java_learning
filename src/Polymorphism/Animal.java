package Polymorphism;

public class Animal {

    private String name;
    private String colour;

    //Method overloading is when methods within the same class have the same name but different parameters
    // Example of eat() and eat(int numberOfTimes)
    public void eat() {
        System.out.println("monch");
    }

    public void eat(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("monch");
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
