package Object_oriented_programming;

public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza() {

    }

    Pizza(String bread) { //this is the constructor for the class

        this.bread = bread; //assigning

    }

    Pizza(String bread, String sauce) { //this is the constructor for the class

        this.bread = bread; //assigning
        this.sauce = sauce;

    }

    Pizza(String bread, String sauce, String cheese) { //this is the constructor for the class

        this.bread = bread; //assigning
        this.sauce = sauce;
        this.cheese = cheese;

    }

    Pizza(String bread, String sauce, String cheese, String topping) {

        this.bread = bread; //assigning
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

    }

}