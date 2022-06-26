import java.util.Scanner;

public class Math_class {

    public static void main(String[] args){

        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        double absolute = Math.abs(y);
        double sqrt = Math.sqrt(x);
        double round = Math.round(x);
        double ceiling = Math.ceil(x);
        double floor = Math.floor(x);

        System.out.println(z);
        System.out.println(absolute);
        System.out.println(sqrt);

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a: ");
        a = scanner.nextDouble();

        System.out.println("Enter side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("The hypotenuse is: " + c);

        scanner.close();
    }
}
