## Soluções Computacionais 02/05 - Netto

### Costrutores e Sobrecarga de métodos

##### Construtores

tres pilares da programação: classe, polimorfismo e (encapsulamento, herança, composição e polimorfismo)

cada construtor transforna a classe em objeto, não construtor de classe, mas sim de objeto da classe
objeto criado após a chamada do construtor utilizando o operador "new" --> Pessoa pessoa = new Pessoa();

Construtor é um metodo especial. deve possuir o mesmo nome da classe e toda classe deve ter um construtor;

obj construtor: criar objetos (comportamento padrão); criar objetos já com valores iniciais; 

sem indincação de retorno

*Operador "this"utilizado para se referir a um atribubto da propria classe

construtores com parametros (dentro dos parenteses); definem valores iniciais e construtor default deixa de ser criado automaticamente

##### Sobrecarga de métodos (Overload)

são métodos que possuem o mesmo nome, mas a assinatura do metodo é diferente - exemplo método println()



exemplo: calcular área de quadrilátero

public class Quadrilatero {

public int calcularArea (int x, int y) {

return x*y;

}

}



public static void main(String[] args) {

Quadrilatero quad = new Quadrilatero( );

sout ("area do quadrilatero" + quad.calcularArea( 2, 1);

}




