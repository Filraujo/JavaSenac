
package mediaaluno;

import java.util.Scanner;

public class MediaAluno {

    
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner (System.in);
        String aluno;
        double nota1, nota2, nota3, media;
        
        System.out.println("Informe seu nome");
        aluno = entrada.nextLine();
        
        System.out.println("Digite sua primeira nota");
        nota1 = entrada.nextDouble();
        
        System.out.println("Digite sua segunda nota");
        nota2 = entrada.nextFloat();
        
        System.out.println("Digite sua terceira nota");
        nota3 = entrada.nextFloat ();
        
        //Valor exato de média do aluno.
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println(aluno + ", o Valor de média de suas notas: " + media);
        
        
        
    }
    
}
