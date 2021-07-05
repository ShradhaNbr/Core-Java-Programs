import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		int power=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Power Value Between 0 to 31");
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			power = 2 * power;
			System.out.print(power + " ");
		}
		
	}

}