package javacourse.jose;

import java.util.Scanner;

/**
 *
 * @author nathalietaylor
 */
public class AulaNetto0404Exerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Exercício: Leia 5 nomes de pessoas e armazene-os em um vetor;Mostre
         * na tela os nomes do último para o primeiro
         */

        Scanner entrada = new Scanner(System.in);

        String[]nomes = new String[5];
        

        for (int i = 0; i <5; i++) {
            System.out.println("Digite um nome");
            nomes[i] = entrada.nextLine();

        }
        for (int i =4 ; i>=0; i--) {
            System.out.println("Os nomes sao:" + nomes[i]);

        }
    }

}
