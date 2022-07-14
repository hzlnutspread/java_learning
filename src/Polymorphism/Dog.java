package Polymorphism;

public class Dog extends Animal{

    private int breed;

    @Override
    public void eat() {
        System.out.println("woof woof");
    }

    public int getBreed() {
        return breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }

}
