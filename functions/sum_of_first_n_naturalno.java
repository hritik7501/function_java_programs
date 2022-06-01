package functions;
import java.util.*;
public class sum_of_first_n_naturalno {
	public static int sum_of(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum = sum+i; 
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sum_of(n);
		System.out.println("sum");

	}

}
