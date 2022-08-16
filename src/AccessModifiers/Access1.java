package AccessModifiers;

public class Access1 {

    // types of access modifiers
    // Default = don't do anything
    // Public
    // Private
    // Protected

    int hours = 3;      // default
    int minutes = 47;   // default

    public int hourss = 10; // public, basically the same as default but you write it in front

    private int minutess = 25; // private means the other classes won't have access to this

    protected int hoursss = 7; // protected means same package has access, but not other packages

    // extending by another class will make these things work though
    // The same can be used for methods within a class

}
