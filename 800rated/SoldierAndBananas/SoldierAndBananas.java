import java.util.*;

public class SoldierAndBananas{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		int preuTotal = 0;

		for (int i = 1; i <= w; i++){
			preuTotal += i*k;
		}
		
		if (preuTotal > n){
			System.out.println(preuTotal - n);
		}
		else{
			System.out.println(0);
		}


	}
}
