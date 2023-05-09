
package armstrong;

import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        int number,temp;
        int remainder,check=0;
        
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter the number you want to check if it is armstrong or not:");
        number=s.nextInt();
        
        temp=number;
        
        while(number !=0){
            remainder = number %10;
            check = check + (remainder*remainder*remainder);
            number /= 10;
            
        }
        if(temp == check){
            System.out.println("Entered number is Palindrome.");
        }
        else{
            System.out.println("Entered number is not Palindrome.");
        }
    }
    
}
