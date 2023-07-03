package insertingarrayinspecifiedposition;
import java.util.Scanner;

public class InsertingArrayInSpecifiedPosition {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int size=s.nextInt();
        
        int[] arr1=new int[size];
        
        System.out.println("Enter the element of arrays:");
        for(int i=0; i<size; i++){
            arr1[i]=s.nextInt();
        }
        
        System.out.println("Enter the position where element to be change:");
        int pos=s.nextInt();
        
        if(pos<0 || pos>size){
            System.out.println("Invalid position!");
        }
        else{
            System.out.println("Enter the element to be changed:");
            int elem=s.nextInt();
            
            System.out.println("Before Inserting:");
            for(int i=0; i<size; i++){
                System.out.println(arr1[i]);
            }  
            
            pos--;
            arr1[pos]= elem;
            
            System.out.println("After Inserting new element"); 
            for(int i=0; i<size; i++){
            System.out.println(arr1[i]);
        }
        }
        
    }
    
}
