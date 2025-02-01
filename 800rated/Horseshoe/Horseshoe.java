import java.util.*;

public class Horseshoe{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int repetitions = 0;
		int [] colors = new int[4];

		for (int i = 0; i < 4; i++){
			colors[i] = sc.nextInt();
		}

		for (int j = 0; j < 4; j++){
			for (int k = j+1; k < 4; k++){
				if (colors[j] == colors[k]){
					repetitions += 1;
				}
			}
		}
		if (repetitions > 3){
			repetitions = 3;
		}
		else if (repetitions == 3){
			repetitions = 2;
		}
		System.out.println(repetitions);
	}
}
