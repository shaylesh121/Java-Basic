
package calculator;

import java.util.Scanner;
import calculator.Addition.*;
import calculator.substraction.*;

public class Calculator {

    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter any two digit:");
        int x=s.nextInt();
        int y=s.nextInt();
        
        calculator.Addition obj= new calculator.Addition();
        obj.addition(x,y);
        System.out.println("The addition is "+(obj.add()));
        
        calculator.substraction obj1= new calculator.substraction();
        obj1.Substraction(x,y);
        System.out.println("The substraction is "+(obj1.sub()));
    }
    
}
