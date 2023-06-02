
package reverseofstring;
import java.util.Scanner;

public class ReverseOfString {
public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        String str;
        
        System.out.println("Enter a string:");
        str=s.nextLine();
        
        System.out.print("Reverse of string '"+str+"':");
        for(int i=str.length(); i>0; i--){
            System.out.print(str.charAt(i-1));
            
        }
    }
    
}
