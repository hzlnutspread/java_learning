package Object_oriented_programming;
import java.util.Scanner;

public class Dynamic_polymorphism {

    public static void main(String[] args) {

        //polymorphism = many forms
        //dynamic = after compilation (during runtime)

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.print("(1 = dog) or (2 = cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
            }
        else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            System.out.println("Thats not an animal wtf");
            animal = new Animal();
            animal.speak();
        }
        }

    }

