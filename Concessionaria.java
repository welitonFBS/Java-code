import java.util.Scanner;

public class Concessionaria {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		//Até R$1000,00 - Entrada de 60%, 12 Meses
		//Até R$3000,00 - Entrada de 40%, 24 Meses
		//Até R$5000,00 - Entrada de 20%, 36 meses
		//Acima de R$5000,00 - Entrada de 10%, 48 Meses
		
		double Salario = in.nextLong();
		double precoCarro = in.nextLong();
		double Entrada = 0;
		double Prestacao = 0;
		
		if (Salario <= 1000.00) {
			Entrada = (precoCarro * 0.6);
			Prestacao = ((precoCarro - Entrada) / 12);
			System.out.println("ENTRADA = R$ "+Entrada);
			System.out.println("PRESTACAO = R$ "+Prestacao);
		} else if (Salario > 1000.00 && Salario <= 2000.00) {
			Entrada = (precoCarro * 0.4);
			Prestacao = ((precoCarro - Entrada) / 24);
			System.out.println("ENTRADA = R$ "+Entrada);
			System.out.println("PRESTACAO = R$ "+Prestacao);
		} else if (Salario > 2000.00 && Salario <= 5000.00) {
			Entrada = (precoCarro * 0.2);
			Prestacao = ((precoCarro - Entrada) / 36);
			System.out.println("ENTRADA = R$ "+Entrada);
			System.out.println("PRESTACAO = R$ "+Prestacao);
		} else if (Salario > 5000.00) {
			Entrada = (precoCarro * 0.1);
			Prestacao = ((precoCarro - Entrada) / 48);
			System.out.println("ENTRADA = R$ "+Entrada);
			System.out.println("PRESTACAO = R$ "+Prestacao);
		}
		in.close();
	}
}
