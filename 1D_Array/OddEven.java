import java.util.Scanner;
public class OddEven
{
    public static void main(String[] args) 
    {
        int n, j = 0, k = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        int odd[] = new int[n];
        int even[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 != 0)
            {
                odd[j] = a[i];
                j++;
            }
            else
            {
                even[k] = a[i];
                k++;
            }
        }
        System.out.print("Odd:");
        if(j == 0)
        {
           System.out.println("No number"); 
        }
        else
        {
            
		for(int i = 0;i < j; i++)
            {
                System.out.println(odd[i]);
            }
        }
        System.out.println("");
        System.out.print("Even:");
        if(k != 1)
        {
          	System.out.println("No number"); 
        }
        else
        {
            
		for(int i = 0; i < k; i++)
            {
                System.out.println(even[i]);
            }
        }
    }
}