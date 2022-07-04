package NullPointerExceptions;

public class Cat {

    private String name;

    Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Meow!!!");
    }
}