
// 1. by using for loop finding the element in array

import java.util.Scanner;
public class SearchElement
 {
   public static void main(String[] args)
	{
	   int n[]= {10,20,30,40,50};
	   int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Elements to check whether it is present in array or not.");
	int num=sc.nextInt();
	
	int savi=0;
	for(i=0;i<n.length;i++)
	{
		if(num==n[i])
		{ 
			savi=1;
			System.out.println("the number "+num+" is  present in given array.");
			break;
		}
		else
			continue;
	}
	if(savi==0)
	System.out.println("the number "+num+" is not "
			+ " present in array.");
	
	}
   }




//2. by using for each loop 

/*
import java.util.Scanner;
public class SearchElement
 {
   public static void main(String[] args)
	{
	   int n[]= {10,20,30,40,50};
	   int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter no. to check whether it is present in above Array or not.\n");
	int num=sc.nextInt();
	
	int savi=0;
	for(int ar:n)
	{
		if(num==ar)
		{ 
		savi=1;	
		System.out.println("the number "+num+" is present in array.");
		}
		
	}
	if(savi==0)
	System.out.println("the number "+num+" is not  present in array.");
	
	}
   }

*/

