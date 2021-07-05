import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		int num1, num2, num3, large;
		System.out.println("Enter the first number");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		System.out.println("Enter the third number");
		num3 = sc.nextInt();
		if (num1 > num2)
			large = num1;
		else
			large = num2;
		if (num3 > large)
			large = num3;
		System.out.println("Largest among 3 numbers is " + large);
	}
}
