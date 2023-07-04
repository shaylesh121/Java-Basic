package multiplicationofmatrix;
import java.util.Scanner;

public class MultiplicationOfMatrix {
    Scanner s= new Scanner(System.in);
    public void InitilizeMatrix(int n,int[][] matrix,int row,int column){
        System.out.println("Enter the element of matrix"+n+":");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix[i][j]=s.nextInt();
            }
        }
    }
    
    public void display(int n,int[][] matrix,int row, int column){
        
        System.out.println("Element of matrix"+n+":");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public void Calculation(int[][] matrix1,int[][] matrix2, int[][] result, int row1,int column1,int row2, int column2){
        for(int i=0; i<row1; i++){
            for(int j=0; j<column2; j++){
                for(int k=0; k<column1; k++){
                    result[i][j] +=  matrix1[i][k]*matrix2[k][i];
                }
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter the rows and column of 1st matrix:");
        int row1=s.nextInt();
        int column1=s.nextInt();
        
        System.out.println("Enter the rows and column of 2nd matrix:");
        int row2=s.nextInt();
        int column2=s.nextInt();
        
        int[][] matrix1= new int[row1][column1];
        int[][] matrix2= new int[row2][column2];
        int[][] result= new int[row1][column2];
        
        while(column1 != row1){
            System.out.println("Error! Enter rows and column again.");
            System.out.println();
            System.out.println("Enter the rows and column of 1st matrix:");
            row1=s.nextInt();
            column1=s.nextInt();

            System.out.println("Enter the rows and column of 2nd matrix:");
            row2=s.nextInt();
            column2=s.nextInt();
        }
        
        //initializing element in 1st matrix
        int n;
        MultiplicationOfMatrix instant= new MultiplicationOfMatrix();
        instant.InitilizeMatrix(n=1,matrix1, row1, column1);
        instant.display(n=1, matrix1, row1, column1);
        
        //initializing element in 1st matrix
        instant.InitilizeMatrix(n=2, matrix2, row2, column2);
        instant.display(n=2, matrix2, row2, column2);
        
        //multiplying matrix1 and matrix2 
        
        instant.Calculation(matrix1, matrix2, result, row1, column1, row2, column2);
        
        //displaying result:
        System.out.println("Result is ");
        instant.display(3, result, row1, column2);
    }
    
}
