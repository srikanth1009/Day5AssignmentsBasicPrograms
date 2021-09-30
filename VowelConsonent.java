package BasicPrograms;
import java.util.Scanner;
public class VowelConsonent {

	    public static void main(String[] args) {
	    	Scanner scan=new Scanner(System.in);//Scanner class
	    	System.out.print("Enter a number: ");
	    	char ch=scan.next().charAt(0);//get input from use

	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	            System.out.println(ch + " is vowel");
	        else
	            System.out.println(ch + " is consonant");

	    }
	}


