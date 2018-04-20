import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double Nota1 = in.nextDouble();
		double Nota2 = in.nextDouble();
		double Nota3 = in.nextDouble();
		double Media = ((Nota1 + Nota2 + Nota3) / 3);
		double Falta = 0;
		
		if (Media < 4) {
			System.out.printf("MEDIA = %1.f",Media);
			System.out.println("Reprovado");
		} else if (Media >= 4 && Media < 7) {
			System.out.printf("MEDIA = %.1f\n",Media);
			System.out.println("Exame");
			Falta = (7 - Media);
			System.out.printf("Faltaram %.1f",Falta," pontos");
		} else if (Media >= 7) {
			System.out.printf("MEDIA = %1.f",Media);
			System.out.println("Aprovado");
		}
		in.close();
	}
}
