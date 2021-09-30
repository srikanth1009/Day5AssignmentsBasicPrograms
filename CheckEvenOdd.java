	package BasicPrograms;

	import java.util.Scanner;
	 public class CheckEvenOdd {
	public static void main (String args[]){
	Scanner scan=new Scanner(System.in);//Scanner class
	System.out.print("Enter a number: ");
	int num=scan.nextInt();//get input from user
	if(num%2==0)
	  System.out.print(num+" is a even number");
	else
	   System.out.print(num+" is a odd number");
	}
	}
