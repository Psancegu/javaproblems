import java.util.*;

public class AntonAndDanik{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);


		int n, antonWins = 0, danikWins = 0;

		n = sc.nextInt();

		String letters = sc.next();

		for(int i = 0; i < n; i++){
			if ( letters.charAt(i) == 'A'){
				antonWins += 1;
			}
			else{
				danikWins += 1;
			}
		}
		
		if (antonWins > danikWins){
			System.out.println("Anton");
		}
		else if (antonWins == danikWins){
			System.out.println("Friendship");
		}
		else{
			System.out.println("Danik");
		}
	}
}
