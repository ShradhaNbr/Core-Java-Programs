import java.util.Scanner;

public class primeFactorization {
    public static void main(String[] args) {
    	int n;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        sc.close();
        for (int i = 2; i <= n; i++) {
            int count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
            }
            if (count > 0) {
                System.out.println(i);
            }
        }
    }
}