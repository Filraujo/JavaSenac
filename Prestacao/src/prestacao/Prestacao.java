
package prestacao;

import java.util.Scanner;


public class Prestacao {


    public static void main(String[] args) {
        
     Scanner entrada = new Scanner (System.in);
     int prestacoes = 5;
     double produto, valorPrestacoes;
     
        System.out.println("Valor do produto: ");
        produto = entrada.nextDouble();
        
        valorPrestacoes = produto / prestacoes;
        
        System.out.println("O valor de parcela é R$" + valorPrestacoes);
        
    }
    
}
