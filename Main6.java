import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int Entrada = in.nextInt();
		int M1 = 0;
		int V1 = 0;
		int M2 = 0;
		int V2 = 0;

		for (int i = 0; i > Entrada; i++) {
			// Time 1
			M1 = in.nextInt();
			in.next();
			// Time 2
			V1 = in.nextInt();
			// time 2
			M2 = in.nextInt();
			in.next();
			// Time 1
			V2 = in.nextInt();

			if ((M1 + V2) > (V1 + M2)) {
				System.out.println("Time 1");
			} else if ((V2 + M2) > (M1 + V2)) {
				System.out.println("Time 2");
			} else if ((M1 + V2) == (V1 + M2)) {
				System.out.println("Penaltis");
			}
		}

	}

}
