import java.util.*;

public class BoyOrGirl{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		String cadena2 = new String("");

		boolean condicio = false;
		for (int i = 0; i < cadena.length(); i++){
			condicio = false;
			for(char j: cadena2.toCharArray()){
				if (cadena.charAt(i) == j){
					condicio = true; 
				}
			}
			if (!condicio){
				cadena2 += cadena.charAt(i);
			}
		}
		if (cadena2.length() % 2 != 0){
			System.out.println("IGNORE HIM!");
		}
		else{
			System.out.println("CHAT WITH HER!");
		}
	}
}
