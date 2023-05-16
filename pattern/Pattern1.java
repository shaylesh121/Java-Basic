/*
        *
        **
        ***
        ****
        *****
 */
package pattern;
import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        int row;
        System.out.println("Enter row you want to print:");
        row=s.nextInt();
        
        for(int i=0; i<row; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    
}
