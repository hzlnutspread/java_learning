public class swap_two_variables {

    public static void main(String[] args){

        String x = "Water";
        String y = "Kool-aid";
        String temp; // or temp = null

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
