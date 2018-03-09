import java.util.Scanner;
import java.util.Locale;

public class URI1040 {
	public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	int cod1 = sc.nextInt();
	int pecas1 = sc.nextInt();
	double valor1 = sc.nextDouble();
	
	int cod2 = sc.nextInt();
	int pecas2 = sc.nextInt();
	double valor2 = sc.nextDouble();
	
	double result1 = pecas1 * valor1;
	double result2 = pecas2 * valor2;
	double tot = result1 + result2;
	
	System.out.printf("VALOR A PAGAR: R$ %.2f\n",tot);		
		
	sc.close();	
	}
}
