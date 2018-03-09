import java.util.Scanner;
import java.util.Locale;

public class URI1037 {
	public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	float valor = sc.nextFloat();
	
	
	if (valor < 0 && valor > 100) {
		System.out.println("Fora de intervalo");
	} else if (valor >= 0 && valor <= 25) {
		System.out.println("Intervalo [0,25]");
	} else if (valor >= 25.01 && valor <= 50) {
		System.out.println("Intervalo (25,50]");
	} else if (valor >= 51.01 && valor <= 75) {
		System.out.println("Intervalo (50,75]");
	} else if (valor >= 76.01 && valor <= 100) {
		System.out.println("Intervalo (75,100]");
	}
	
	sc.close();
	}
}
	