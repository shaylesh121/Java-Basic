
package maximunnoinarray;
import java.util.Scanner;

public class MaximunNoInArray {
        
    static void initilize(int[] array , int size){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the element of array:");
            
        for(int i=0; i<size; i++){
            array[i]=s.nextInt();
        }
    }
        
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int size=s.nextInt();
        
        int[] array= new int[size];
        
        initilize(array , size);
        
        for(int i=0; i<size; i++){
            System.out.print(array[i]+"\t");
        }
        int max = array[0];
        
        for(int i=0; i<size; i++){
            if(max<array[i]){
                max = array[i];
            }    
        }
        System.out.println("\nMaximum Element in array="+max);
    }
    
}
