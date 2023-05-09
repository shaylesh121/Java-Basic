import java.util.Scanner;

public class array{
	public static void main(String[] args){
		//Compile time array
		int[] arr={1, 2, 2, 4, 5};
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		//Run time array
		int sizeofArray;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of array");
		sizeofArray=scn.nextInt();
		System.out.println();
		System.out.println("Enter the elements");
		
		int[] pts=new int[sizeofArray];
		int flag=0;
		for(int i=0; i<sizeofArray; i++){
			pts[i]=scn.nextInt();
		}

		int esum=0,osum=0;
		for(int i=0; i<sizeofArray; i++){
			if(pts[i]%2==0){
				esum=esum+pts[i];	
				flag++;
			}
			else{
				osum+=osum+pts[i];
			}	
		}
		System.out.println("Even Sum="+esum);
		//System.out.println("Odd Sum="+osum);
	}
}