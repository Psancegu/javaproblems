import java.util.*;


public class Tram{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int n, down, up, pass = 0, maxPass = -1;

		n = sc.nextInt();

		for(int i = 0; i < n; i++){
			pass -= sc.nextInt();
			pass += sc.nextInt();

			if( pass > maxPass){
				maxPass = pass;
			}
		}

		System.out.println(maxPass);
	}
}
