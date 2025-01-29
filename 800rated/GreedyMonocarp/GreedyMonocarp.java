import java.util.*;

public class GreedyMonocarp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Número de casos de prueba
        int n, k;
        int agafat, MonedesAfegides, pos;

        for (int i = 0; i < t; i++) {
            n = sc.nextInt(); 
            k = sc.nextInt(); 

            int[] cofres = new int[n];
            for (int j = 0; j < n; j++) {
                cofres[j] = sc.nextInt();
            }

            agafat = 0;
            pos = n - 1;
            MonedesAfegides = 0;

            Arrays.sort(cofres);

            while (agafat < k) {
		if (pos < 0){
			MonedesAfegides += k - agafat;
			break;
		}
		    
                if (agafat + cofres[pos] <= k) {
                    agafat += cofres[pos]; 
                    pos--; 
                } else {
                    MonedesAfegides += k - agafat; 
                    agafat = k; 
                }
            }

            System.out.println(MonedesAfegides); 
        }
    }
}
