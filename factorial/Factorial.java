
package factorial;
import java.util.Scanner;

public class Factorial {

   
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       
        System.out.println("Enter the number you want to factorize:");
        int num= s.nextInt();
        
        int fact=1;
        for(int i=1; i<=num; i++){
            fact= fact*i;
        }
        System.out.println("Factorial of"+ num +"="+fact);
    }
}
