import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int resValor, nTeste;
		int valorLED[] = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

		Scanner sc = new Scanner(System.in);

		nTeste = sc.nextInt();
		for (int i = 1; i <= nTeste; i++) {
			int everyValue = 0, totalLed = 0;
			resValor = sc.nextInt();

			while (resValor != 0) {
				everyValue = (resValor % 10);
				resValor /= 10;
				totalLed += valorLED[everyValue];
			}
			System.out.println(totalLed + " leds");
		}
		sc.close();
	}

}
