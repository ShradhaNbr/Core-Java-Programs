import java.util.Scanner;

public class harmonic_number {
	public static void main(String[] args) {

		int n;
		float harmonic = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		for(float i=1;i<=n;i++) {
		harmonic=harmonic + (1/i);
		}
		System.out.println("Harmonic number is " + harmonic);
	}
}
