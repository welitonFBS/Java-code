import java.util.Scanner;
import java.util.Locale;

public class URI1038 {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);

	int cod = sc.nextInt();
	int quant = sc.nextInt();
	double total = 0;

	if (cod < 1 && cod > 5){
		System.out.println("Codigo errado, digite um valor entre 1 e 5");
	} else if (cod == 1) {
		total = 4.00 * quant;
	} else if (cod == 2) {
		total = 4.50 * quant;
	} else if (cod == 3) {
		total = 5.00 * quant;
	} else if (cod == 4) {
		total = 2.00 * quant;
	} else {
		total = 1.50 * quant;
	}

	System.out.printf("Total: R$ %.2f\n",total);
	sc.close();
	}
}