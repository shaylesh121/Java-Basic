
package exceptionhandling;
import java.util.Scanner;
        
public class ExceptionHandling {
    void profitCalc(double[] cf){
        double[] returnProfit= new double[cf.length];
        try{
            for(int i=0; i<cf.length; i++){
                returnProfit[i]= cf[i] + (cf[i]*.06);
            }
            System.out.println("\nPrice after 6%% profit:\t\tProfit amount:");
            for(int i=0 ; i<returnProfit.length; i++){
                System.out.printf("\n%f\t\t%f", returnProfit[i], (returnProfit[i]-cf[i]));
            }
        }catch(Exception e){        
            System.out.println(e.getMessage());
        }   
    }
    
    public static void main(String[] args) {
        ExceptionHandling obj= new ExceptionHandling();
        
        int arrayLength;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        double[] costOfFruit;
        try{
            arrayLength= s.nextInt();
            costOfFruit= new double[arrayLength];
            System.out.println("Enter the element of array:");
            for(int i=0; i<arrayLength; i++){
                costOfFruit[i]=s.nextInt();
            }
            obj.profitCalc(costOfFruit);
        }catch(Exception e){
            System.out.println("Sorry"+e.getMessage());
        }
    }
    
}
