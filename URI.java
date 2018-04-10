package javapacoti;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		while (M > 0 && N > 0) {
			int maior = M;
			int menor = N;
			if (M < N) {
				maior = N;
				menor = M;
			}
			int total = 0;
			while (menor <= maior) {
				total += menor;
				// total = total + menor;
				System.out.println(menor + " ");
				menor++;
			}
			System.out.println("Sum=" + total);
			M = sc.nextInt();
			N = sc.nextInt();
			
		sc.close();
		}
	}

}
