public class PrimeOrNot{
	static void checkPrime(int n){
		int flag=0;
		
		//0 and 1 is not prime number 
		if(n == 0 || n==1 ){
			System.out.println(n + " is not prime number.");
		}
		
		//here else part check the condition
		else{
			for( int i=2; i <= (n/2); i++){
				if( n % i == 0){
					System.out.println( n+ " is not prime number.");
					flag=1;
				}
			}
			if(flag==0){
				System.out.println( n + " is prime number."); 
			}
		}
	}
	public static void main(String[] args){
		//function call check if the number is prime or not.
		checkPrime(1);
		checkPrime(2);
		checkPrime(3);
		checkPrime(4);
		checkPrime(5);
		checkPrime(6);
		checkPrime(7);

	}
}