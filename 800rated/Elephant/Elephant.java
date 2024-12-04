import java.util.*;

public class Elephant{
	public static void main(String [] agrs){
		Scanner sc = new Scanner(System.in);

		int distCasa = sc.nextInt();
		int salts = 0;

		while (distCasa > 0){
			if (distCasa >= 5){
				salts += 1;
				distCasa -= 5;	
			}
			else{
				salts += 1;
				distCasa = 0;
			}
		}
		System.out.println(salts);


	}
}

