import java.util.*;

public class CapsLock{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

			String cadena = sc.nextLine();
			String cadenac2 = cadena.toLowerCase().charAt(0) + cadena.toUpperCase().substring(1);

			if (cadena.toUpperCase().equals(cadena)){
				cadena = cadena.toLowerCase();
			}
			else if (cadena.equals(cadenac2)){	
				cadena = cadena.toUpperCase().charAt(0) + cadena.toLowerCase().substring(1);
			}
			System.out.println(cadena);
	}
}
