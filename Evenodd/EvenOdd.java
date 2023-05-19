
package evenodd;
import java.util.Scanner;

public class EvenOdd {

   
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       
        System.out.println("Enter the number you want to check:");
        int num = s.nextInt();
        
        if(num%2==0){
            System.out.println(num +" is even number.");
        }
        else{
            System.out.println(num +" is odd number.");
        }
    
    }
}
