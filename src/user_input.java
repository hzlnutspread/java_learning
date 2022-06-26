import java.util.Scanner;

public class user_input {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);       //create a scanner object

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();                             //there is still a \n in the scanner. This clears it out.
        System.out.println("You are " + age + " years old");

        System.out.println("What is your favourite food? ");
        String food = scanner.nextLine();
        System.out.println("You like " + food);
    }
}
