
package additionofmaindiagonal;
import java.util.Scanner;

public class AdditionOfMainDiagonal {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        start:
        System.out.println("Enter rows of matrix:");
        int rows= s.nextInt();
        
        
        int[][] matrix= new int[rows][rows];
        System.out.println("Enter the elements of matrix:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<rows; j++){
                matrix[i][j]=s.nextInt();
            }
        }    
        
        System.out.println("The element of matrix is");
        for(int i=0; i<rows; i++){
            for(int j=0; j<rows; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }  
        
        
        int sum=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<rows; j++){
                if(i==j){
                    sum += matrix[i][j];
                }    
            }
        }  
        System.out.println("Sum of main diagonal elements of matrix is "+sum);
    }
    
}
