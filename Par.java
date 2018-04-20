import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//Entre com dois valores de ponto flutuantes
		System.out.print("Digite dois números: ");
		double Primeiro = in.nextDouble();
		double Segundo = in.nextDouble();
		
		//Enquanto o Primeiro for diferente de zero e o Segundo for diferente de zero, faça isso
		while (Primeiro != 0 && Segundo != 0) {
			
			//Se o Primeiro for maior que o Segundo Imprima Menor = valorSegundo
			if (Primeiro > Segundo) {
				System.out.println("Menor = " + Segundo);
			
			//Senão Imprima Menor = valorPrimeiro
			} else {
				System.out.println("Menor = " + Primeiro);
			}
			
			//Repete a leitura dos valores para entrar novamente no Loop.
			//Entrando novamente com os valores, voltará pra regra constada no while
			//"Se um for diferente de 0, entra no loop"
			//"Se os dois valerem zero, cai fora!
			Primeiro = in.nextDouble();
			Segundo = in.nextDouble();
		}
		in.close();
	}

}
