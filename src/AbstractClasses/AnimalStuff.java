package AbstractClasses;

public interface AnimalStuff {

    int age = 12;
    String name = "bing bong";      // These are static final by default, apply to all objects

    public void poop();             // Every method in an interface is assumed to be abstract
}
