package AbstractClasses;

public abstract class Animal {  // make it abstract because you don't want to create animal objects.
                                // But you can make subclasses of it (such as the Cat class)
    int age;
    String name;

    public abstract void makeNoise();   // This enforces all subclasses to have this method
                                        // You will see makeNoise() in cat with its own implementation

    public void printName() {
        System.out.println("My name is " + name);
    }

}
