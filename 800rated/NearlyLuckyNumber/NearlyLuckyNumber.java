import java.util.*;

public class NearlyLuckyNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int len, counter;

		counter = 0;
		String digits = sc.next();
		len = digits.length();

		for (int i = 0; i < len; i++){
			if (digits.charAt(i) == '4' || digits.charAt(i) == '7'){
				counter += 1;
			}
		}

		if (counter == 4 || counter == 7){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}	
	}
}
