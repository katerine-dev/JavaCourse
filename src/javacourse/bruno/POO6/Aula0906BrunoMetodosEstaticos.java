package javacourse.bruno.POO6;

import javacourse.bruno.POO5.AlunoHeranca;

public class Aula0906BrunoMetodosEstaticos {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Vantagem: Manipulação de matriz de imagem por exemplo.
        // Transmitir informações quebrando o encapsulamento do Java, é usado com moderação

        Calculadora c1 = new Calculadora("Bruno", 3456, 987);
        c1.print();
        // qualquer mudança em um atributo altera todos.
        Calculadora c2 = new Calculadora();
        c2.print();
        c1.print();
        // getters and setters estaticos. (Você consegue acessar sem chamar a classe)
        // ele não encapsula
        Calculadora.setA(23452);
        c2.print();

    }
}
