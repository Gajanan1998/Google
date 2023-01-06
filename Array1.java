//WAP to print smallest number in a given series of numbers.


package Arrays;
import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter values in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}			
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{
				System.out.println(arr[i]);
				break;
			}
			
		}	
	}
	public static boolean isPrime(int num)
	{
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
