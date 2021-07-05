import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		int num1, num2, temp;
		System.out.println("Enter the first number");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("First number after swapping is " + num1);
		System.out.println("Second number after swapping is " + num2);
		sc.close();
	}
}
