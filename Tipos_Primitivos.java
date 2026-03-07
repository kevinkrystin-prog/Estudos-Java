
package tipos_primitivos;

import java.util.Scanner;


public class Tipos_Primitivos {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Qual o nome do aluno?:");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno:");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f ", nome, nota);
    }
    
}
