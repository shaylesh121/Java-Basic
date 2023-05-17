/*
        pattern example
        * * * * *
        * * * *
        * * *
        * *
        *

*/
package pattern;
import java.util.Scanner;

public class Pattern2 {
     public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        int row;
        System.out.println("Enter row you want to print:");
        row=s.nextInt();
        
        for(int i=row; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}