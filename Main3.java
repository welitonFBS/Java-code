import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int Quantidade = in.nextInt();

		for (int i = 0; i < Quantidade; i++) {
			int X = in.nextInt();
			int Y = in.nextInt();
			int Centimetro = (X * Y) / 2;
			System.out.println(+Centimetro + " cm2");
		}

	}

}
