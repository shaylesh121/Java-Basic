package inilizationof2darray;

import java.util.Scanner;

public class InitializationOf2DArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter rows and columns of matrix:");
        int rows = s.nextInt();
        int cols = s.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements of matrix:");
        // for rows
        for (int i = 0; i < rows; i++) {
            // for columns
            for (int j = 0; j < cols; j++) {
                // initializing matrix's elements
                array[i][j] = s.nextInt();
            }
        }
        System.out.println("The matrix is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

