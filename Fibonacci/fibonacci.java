import java.util.*;

class fibonacci{
	public static void main(String[] args){
		int num1=1,num2=2;
		int num3,i,count=0;
		
		Scanner scn= new	Scanner(System.in);

		System.out.print("Enter the index element of series:");
		num1=scn.nextInt();

		System.out.print("Enter the next element after index number:");
		num2=scn.nextInt();
		
		System.out.print("Enter the number you would like to generate:");
		count=scn.nextInt();

		System.out.print(num1+" "+num2);

		for(i=0; i<count; i++){
			num3=num1 + num2;
			System.out.print(" "+num3);
			num1= num2;
			num2= num3;
		}
	}
}