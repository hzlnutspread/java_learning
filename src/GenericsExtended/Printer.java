package GenericsExtended;

public class Printer <T, V> {      // Type parameter <T> is the convention. Stands for Type of thing that printer can print
    // You can extend classes by saying <T extends Animal>
    // This is called a bounded generic since its bound by what it extends and can only create objects of that type
    // You also implement interfaces by saying <T extends Interface>
    // You can extend many classes <T extends Animal & Interface>
    T thingToPrint;
    V otherThing;

    public Printer(T thingToPrint, V otherThing) {
        this.thingToPrint = thingToPrint;
        this.otherThing = otherThing;
    }

    public void print() {
        System.out.println(thingToPrint + " " + otherThing);

    }

}
