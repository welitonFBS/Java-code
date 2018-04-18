import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		//1 Não Satisfatório
		//2 Satisfatório		
		int Participantes = in.nextInt();
		int Satisfatorio = 0;
		int naoSatisfatorio = 0;
		
		for (int i=0; i < Participantes; i++) {
			int Leitura = in.nextInt();
			if (Leitura == 0) {
				Satisfatorio++;
			} else {
				naoSatisfatorio++;
			}
			
		}
		if (Satisfatorio > naoSatisfatorio) {
			System.out.print("Y");
		} else {
			System.out.print("N");
		}
		
	}
}