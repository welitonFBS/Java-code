import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int Entrada = in.nextInt();
		int Dias = 0;

		for (int i = 0; i < Entrada; i++) {
			double Comida = in.nextDouble();

			while (Comida > 1) {
				Comida = (Comida / 2);
				Dias++;
			}
			System.out.println(Dias + " dias");
			Dias = 0;
		}

	}

}
