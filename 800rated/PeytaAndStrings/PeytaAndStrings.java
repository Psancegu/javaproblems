import java.util.*;

public class PeytaAndStrings{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		char [] llista = new char[26];	
		
		for(int i = 0; i < 26; i++){
			llista[i] = (char) ('a' + i);
		}

		String cadena1 = sc.nextLine().toLowerCase();
		String cadena2 = sc.nextLine().toLowerCase();
		
		boolean iguals = true;
		int j =  0;
		while (j < cadena1.length() && iguals){
			int index1 = 0;
			int index2 = 0;
			for(int k = 0; k < 26; k++){
				if (cadena1.charAt(j) == llista[k]){
					index1 = k;       	
				}
				if (cadena2.charAt(j) == llista[k]){
					index2 = k;
				}
			}
			if (index1 < index2){
				System.out.println(-1);
				iguals = false;
			}
			else if (index1 > index2){
				System.out.println(1);
				iguals = false;
			}
			j++;
		}
		if (iguals){
			System.out.println(0);
		}
	}
}
