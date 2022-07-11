package Debugging;

public class DebuggingExampleThree {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Kramer");
        cat1.setLitterPreference("TidyCats");
        cat1.setAge(3);

        Cat cat2 = new Cat("George");
        cat2.setLitterPreference("Fresh Step");
        cat2.getLitterPreference();
        System.out.println(cat2.getAge());

        Cat[] cats = new Cat[2];

        cats[0] = cat1;
        cats[1] = cat2;
    }

}
// You can add expressions in the debug runner such as "cat1.getAge() * 53"
// Can also hover over the variable in the editor to see more details
// Can also highlight what you want and right-click and click on "evaluate expression"

// How to inspect individual things and see their value in Intellij???

// The side bar has functions to disable and view breakpoints etc
