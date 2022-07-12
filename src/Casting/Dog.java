package Casting;

public class Dog extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("WOof WOoF!");
    }

    public void growl() {
        System.out.println("Grrrr");
    }
}
