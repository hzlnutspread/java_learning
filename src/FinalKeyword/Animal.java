package FinalKeyword;

public class Animal {     // Final class means prevents other classes from being a subclass of it. Dog class cant extend it now
    // Usually dont use final classes unless its something like constants
    private String name;
    private String colour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public /*final*/ void eat() {               // All subclasses can no longer override the eat() method with their own implementation
        System.out.println("munch munch");      // Can still call eat() on a dog object even if its not a method in Dog class
    }

}
