package Loops;

import java.util.Scanner;
//nested loop = loop inside a loop

public class nested_loops {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter number of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for(int i = 1; i <= rows; i++){
            for(int y = 1; y <= columns; y++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}