import java.util.Scanner;

public class coinFlip {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double n, tails = 0, heads = 0;
		double head_percent, tail_percent;
		System.out.println("How many times coin to be flipped");
		n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			double coinFlip = Math.floor(Math.random() * 10) % 2;
			if (coinFlip < 0.5) {
				System.out.println("Tails");
				tails++;
			} else {
				System.out.println("Heads");
				heads++;
			}

		}
		head_percent = (heads * 100) / n;
		tail_percent = (tails * 100) / n;
		System.out.println("Tail percentage is " + tail_percent);
		System.out.println("Head percentage is " + head_percent);
	}
}