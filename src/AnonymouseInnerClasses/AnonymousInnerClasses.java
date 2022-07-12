package AnonymouseInnerClasses;

public class AnonymousInnerClasses {

    public static void main(String[] args) {

        // Class with no name that you use to instantiate one object EVER
        // You define/instantiate it at the same time in the same statement
        // Can either extend any existing class or implement any interface

        Animal myAnimal = new Animal();
        myAnimal.makeNoise();

        // We want to create BigFoot and there is only ever going to be one instance of it
        // And we want it to make noise but different implementation
        // only has one-time use
        //bigFoot technically isnt an animal type, its type has no name and its the method we've given it
        // Its just a subclass of Animal
        Animal bigFoot = new Animal() {
            @Override
            public void makeNoise() {
                System.out.println("Grawelengelelgeneg");
            }
        };
        bigFoot.makeNoise();

        // Creating an anonymous inner class thats implementing the runnable interface
        // This is just a class without a name that implements the runnable interface
        Runnable myAnonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Im an anonymous runnable");;
            }
        };
        myAnonymousRunnable.run();

    }
}
