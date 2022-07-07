package FinalKeyword;

public class Dog extends Animal {

    private int walkDistancePreference;

    public void bark() {
        System.out.println("woof");
    }

    public void eat() {           // Error because parent class eat() method is final
        System.out.println("nom nom nom" + FinalKeyword.PI);
    }

    public int getWalkDistancePreference() {
        return walkDistancePreference;
    }

    public void setWalkDistancePreference(int walkDistancePreference) {
        this.walkDistancePreference = walkDistancePreference;
    }
}
