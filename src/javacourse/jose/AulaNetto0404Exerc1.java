package javacourse.jose;
import java.util.Scanner;



/**
 *
 * @author nathalietaylor
 */
public class AulaNetto0404Exerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/**
 * Exercício: Leia 10 valores inteiros e armazene-os em um vetor
 */

Scanner entrada = new Scanner(System.in);

int[] valores = new int[10];
int tamanho = valores.length;

for (int i=0; i<tamanho; i++){
    System.out.println("Digite um numero inteiro");
    valores[i] = entrada.nextInt();
    
}
    for (int i=0; i<tamanho; i++){
        System.out.println("valor" + (i+1) + "=" + valores[i]);

    }  
    }
    
}
