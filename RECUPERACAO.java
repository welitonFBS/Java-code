//(A) NÚMERO PERFEITO
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    
    int entrada = in.nextInt();
    int valor;
    
    for (int i=0; i < entrada; i++) {
      valor = in.nextInt();
        if (valor % 2 == 0) {
          System.out.println(valor+" eh perfeito");
        } else if (valor % 2 != 0) {
          System.out.println(valor+"nao eh perfeito");
        }
      valor = in.nextInt();
    }    
    in.close();  
  }
}
