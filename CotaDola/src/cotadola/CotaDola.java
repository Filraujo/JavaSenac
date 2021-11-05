
package cotadola;

import java.util.Scanner;

public class CotaDola {

  
    public static void main(String[] args) {
       
          Scanner entrada = new Scanner (System.in);
        double real, dolar, cotacao;
        
        
        System.out.println("Digite quantos doláres você tem:");
        dolar = entrada.nextDouble();
        
        System.out.println("Qual é a cotação do dolar hoje:");
        cotacao = entrada.nextDouble();
        
        real = dolar * cotacao;
        
        System.out.println("Você tem R$ " + real);
        
        
    }
    
}
