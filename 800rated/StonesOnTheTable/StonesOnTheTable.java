import java.util.*;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int llargada = sc.nextInt(); 
        sc.nextLine(); 

        String cadena = sc.nextLine();

        char pre = cadena.charAt(0);
        int counter = 0;

        
        for (int i = 1; i < cadena.length(); i++) {
            char current = cadena.charAt(i);
            if (pre == current) {
                counter += 1; 
            } else {
                pre = current; 
            }
        }

        System.out.println(counter); 
    }
}
