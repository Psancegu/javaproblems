import java.util.*;

public class BearAndBigBrother{
	public static void main(String [] agrs){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int years = 0;

		while (a <= b){
			a = 3*a;
			b = 2*b;
			years += 1;
		}
		System.out.println(years);
	}
}
