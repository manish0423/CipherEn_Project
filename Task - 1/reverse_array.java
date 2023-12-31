import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size of Array : ");
		int size=s.nextInt();
		System.out.print("Enter Array Elements : ");
		int a[]=new int[size];
		int b[]=new int[size];
		for(int i=0;i<size;i++)
		{
		    a[i]=s.nextInt();
		}
		System.out.print("Original Array : ");
		for(int i=0;i<size;i++)
		{
		    System.out.print(a[i]+" ");
		    b[i]=a[(size-1)-i];
		}
		System.out.println();
		System.out.print("Reversed Array : ");
		for(int i=0;i<size;i++)
		{
		    System.out.print(b[i]+" ");
		}
	}
}