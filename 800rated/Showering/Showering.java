import java.util.*;

public class Showering{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int n,s,m = 0;
		int l,r = 0; // Són els resectius valors de cada interval de temps
		int previous = 0;
		boolean trobat = false;
		int iniInterval, fiInterval;

		for (int i = 0; i < t; i++){
			trobat = false;
			n = sc.nextInt(); // Tasques
			s = sc.nextInt(); // Temps Dutxa
			m = sc.nextInt(); // Durada Dia
			for(int counter = 0; counter < n; counter++){
				l = sc.nextInt();
				r = sc.nextInt();

				if (counter == 0){
					if (l >= s){
						trobat = true;
					}
					else{
						previous = r;
					}
				}
				if (counter == n-1){
					if (l-previous >= s){
						trobat = true;
					}
					else if (m-r >= s){
						trobat = true;
					}
				}
				else{
					if(l-previous >= s){
						trobat = true;
					}
					else{
						previous = r;
					}
				}
			}
			if (trobat){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}

		}

	}
}
