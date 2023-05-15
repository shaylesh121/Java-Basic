/*
 * swapping without using third variable.
 */
package swapping;

import java.util.Scanner;

public class Swapping {
    
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter first number");
        int num1= s.nextInt();
        
        System.out.println("Enter second number");
        int num2= s.nextInt();
        
        System.out.println("Before swapping:");
        System.out.println("Number1= "+num1 +" Number2= "+num2);
        
        //let num1=2 & num2=3;
        num2 = num1 + num2;     //num2=5;
        num1 = num2 - num1;     //num1=5-2 = 3; num1=3 
        num2 = num2 - num1;     //num2=5-3;
        
        System.out.println("After swapping:");
        System.out.println("Number1= "+num1 +" Number2= "+num2);
    }
    
}
