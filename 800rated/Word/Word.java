import java.util.*;

public class Word{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		String cadena = sc.nextLine();
		int majus = 0;
		int minus = 0;

		for (int i = 0; i < cadena.length(); i++){
			if(Character.isUpperCase(cadena.charAt(i))){
				majus += 1;
			}	
			else{
				minus += 1;
			}
		}

		int diffMajus = cadena.length() - majus;
		int diffMinus = cadena.length() - minus;

		if(diffMajus < diffMinus){
			System.out.println(cadena.toUpperCase());
		}
		else{
			System.out.println(cadena.toLowerCase());
		}
	}
}
