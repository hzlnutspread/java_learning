//2D array = array of arrays

public class arrays_2D {

    public static void main(String[] args){

        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "a";
        cars[0][2] = "b";
        cars[1][0] = "c";
        cars[1][1] = "d";
        cars[1][2] = "e";
        cars[2][0] = "f";
        cars[2][1] = "g";
        cars[2][2] = "h";

        for(int i = 0; i <cars.length; i++) {
            for(int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }

    }
}