
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int size=s.nextInt();
		System.out.println("Enter Array Elements : ");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
		    a[i]=s.nextInt();
		}
		//Arrays.sort(a);
		int min=a[0];
		for(int i=0;i<size;i++)
		{
		    if(min>a[i])
		    {
		        min=a[i];
		    }
		}
		System.out.println("Minimum Element : "+min);
	}
}
