
package areaofcircle;
import java.util.Scanner;

public class AreaOfCircle {
    static void area(float r){
        System.out.println("Area of Circle="+Math.PI*r*r);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the radius of circle:");
        float radius=s.nextFloat();
        
        area(radius);
    }
    
}
