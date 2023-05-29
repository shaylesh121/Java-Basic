
package givenstringispalindrome;
import java.util.Scanner;

public class GivenStringIsPalindrome {

    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        String str,rev="";
        
        System.out.println("Enter a string:");
        str=s.nextLine();
        
        int length= str.length();
        
        for(int i= length-1; i>=0; i--){
            rev = rev+ str.charAt(i);
        }
        
        if(str.equals(rev)){
            System.out.println(str+" is Palindrome.");
        }
        else{
            System.out.println(str+" is not Palindrome");
        }
    }
    
}
