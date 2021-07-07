import java.util.Scanner;

public class Array_2D {
	public static void  int_array (int m, int n) {
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				Object[][] arr;
				arr[i][j] = sc.nextInt();
				System.out.println("Array elements are" + arr[i][j]);
			}
	    }
	}
			public static void double_array (double m, double n) {
				for(i=0;i<m;i++) {
					for(j=0;j<n;j++) {
						arr[i][j] = sc.nextInt();
						System.out.println("Array elements are" + arr[i][j]);
					}
				}
			}
	       public static void boolean_array (boolean m, boolean n) {
	    	   for(i=0;i<m;i++) {
	    			for(j=0;j<n;j++) {
	    				arr[i][j] = sc.nextInt();
	    				System.out.println("Array elements are" + arr[i][j]);
	    			}
	    	   }
	       }
	       public static void select_type(int m, int n) {
	    	   System.out.println("Enter the type you want 1. integer, 2. doule, 3. boolean ");
	    	   Scanner sc = new Scanner(System.in);
	    	   choice=sc.nextInt();
	    	   switch(choice)
	    	   {
	    	   case 1:
	    		   System.out.println("Array in integers are");
	    		   int_array(int m, int n)
	    		   break;
	    	   case 2:
	    		   System.out.println("Array in doubles are");
	    		   double_array(int m, int n)
	    		   break;
	    	   case 3:
	    		   System.out.println("Array in boolean are");
	    		   booelan_array(int m, int n)
	    		   break;
	    	   default :
	    		   System.out.println("Invalid Option");
	    	   }
	    	   }
public static void main(String[] args) {
	int i, j;
	int arr[][] = new int[10][20] ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of rows");
	m = sc.nextInt();
	System.out.println("Enter number of columns");
	n = sc.nextInt();
	System.out.println("Enter" + m + "X" + n + "array elements");
	select_type(int m, int n)
	sc.close();
}
}
