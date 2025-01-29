import java.util.*;

public class Translation{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		String original = sc.next();
		String backwards = sc.next();
		String aux = new String("");	
		int len = original.length();

		for( int i = 0; i < len ; i++){
			aux = original.charAt(i) + aux;
		}

		if (aux.equals(backwards)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
