package BasicPrograms;
import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		double x = 0, y = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x condinate");
		double x1 = sc.nextDouble();
		System.out.println("Enter y condinate");
		double y1 = sc.nextDouble();
		// calulating distance
		double distance = Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
		System.out.println(distance);

	}
}
