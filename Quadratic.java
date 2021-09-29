package BasicPrograms;
import java.util.Scanner;
public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		double a = sc.nextDouble();
		System.out.println("Enter b");
		double b = sc.nextDouble();
		System.out.println("Enter c");
		double c = sc.nextDouble();
		double delta = (b * b - 4 * a * c);
		if (delta > 0) {
			System.out.println(delta);
			double root1 = -b + (Math.sqrt(delta)) / (2 * a);
			System.out.println(root1);
			double root2 = -b - (Math.sqrt(delta)) / (2 * a);
			System.out.println(root2);
		}
	}
}

