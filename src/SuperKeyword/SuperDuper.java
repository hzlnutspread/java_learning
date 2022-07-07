package SuperKeyword;

public class SuperDuper {

    public static void main(String[] args) {

        // super used to access things in the parent/super class of the one you're working in
        // Can only be used inside a class to refer to that class's super class/parent class
        // Can't use super to access private methods

        Cat myCat = new Cat(3, "George", "Purina One");
        System.out.println(myCat.age + myCat.name + myCat.catFoodPreference);
        myCat.makeNoise();
        myCat.eat();
    }
}

