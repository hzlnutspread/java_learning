public class Recursion {

    public static void main(String[] args) {

        sayHi(3);

    }

    private static void sayHi(int count) {
        System.out.println("Hi");

        if (count <= 1) {   // base case in every recursion method otherwise stack overflow probably
            return;
        }
        sayHi(count - 1);           // Recursive method since its calling itself within itself. Stack overflow probably
        // Need something to work towards
    }
}