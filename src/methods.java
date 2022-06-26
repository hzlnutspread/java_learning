// method = a block of code that is executed whenever it is called upon
// main (below) is a method

// arguments and parameters dont need to be the same

public class methods {

    public static void main(String[] args) {

        String name = "Sniper Monkey";
        int age = 21;
        hello(name, age);                    //the name passed into the function is the argument. Can have more than 1 args
    }

    static void hello(String name, int age) {            //static because main function is static. "name" is the parameters.
        System.out.println("Hello " + name + " you are " + age + " years old!");
        System.out.println(age);

    }


}