import java.util.*;

class palindrome{
	public static void main(String[] args){
		int num,temp,rem,sum=0;
		Scanner scn= new Scanner(System.in);

		System.out.print("Enter number you want to check:");
		num=scn.nextInt();
		
		temp=num;

		while(num!=0){
			rem=num%10;
			sum = (sum*10) + rem;
			num/=10;
		}
		if(temp==sum){
			System.out.print("The given number is Palindrome."); 
		} 
		else{
			System.out.print("The given number is not Palindrome.");	
		}
		
	}



}