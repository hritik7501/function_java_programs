package functions;
import java.util.*;
public class largest_of_three_no {
	public static int largest(int first, int second, int third){
        int max = first;
        if(second>first)
        max = second;
        if(third>max)
        max=third;
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int max = largest(first, second, third);
        System.out.println(max);
        
        
}
}
