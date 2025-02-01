import java.util.*;

public class UltraFastMathematician{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		String cadena1 = sc.next();
		String cadena2 = sc.next();
		String cadenaFinal = new String("");


		for (int i = 0; i < cadena1.length(); i++){
			if (cadena1.charAt(i) == cadena2.charAt(i)){
				cadenaFinal += '0';
			}
			else{
				cadenaFinal += '1';	
			}
		}
		System.out.println(cadenaFinal);
	}
}
