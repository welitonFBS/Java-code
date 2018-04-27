//(A) NÚMERO PERFEITO
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    
    int entrada = in.nextInt();
    int valor = in.nextInt();
    
    for (int i=0; i < entrada; i++) {
      entrada = in.nextInt();
        if (entrada % 2 == 0) {
          System.out.println(valor+" eh perfeito");
        } else if (entrada % 2 != 0) {
          System.out.println(valor+"nao eh perfeito");
        }
      entrada = in.nextInt();
    }    
    in.close();  
  }
}
