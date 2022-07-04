package AbstractClasses;

public class Cat extends Animal implements AnimalStuff {

    @Override
    public void makeNoise() {
        System.out.println("Meow!");    // Since it extends animal, it needs to implement the abstract method makeNoise() and be have its own implementation
    }

    @Override
    public void poop() {
        System.out.println("POOOOOP!");
    }
}

