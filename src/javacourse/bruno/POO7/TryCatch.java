/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacourse.bruno.POO7;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author jenni
 */
public class TryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota= 0;
        Scanner sc = new Scanner (System.in);
        
        Notas nt = new Notas();
        
        boolean flag = false;
                
        
            do{
            System.out.println("Digite uma nota inteira: ");
            
            try{//indica o começo da atenção do software || esse try mostra que o next int não é uma opção válida
                //se rodou tudo certinho ele não executa o catch, ou seja se não houve exceções o programa roda normal
             nota = sc.nextInt();//se rodou direitinho ela termina a linha 27 e pula para a 28 e acusa que o está tudo certo com o flag
             //flag = true; // se digitou um inteiro o flag passa para verdadeiro
             
             
             /*
             if((nota<0) || (nota>10)){ // quando a nota não está dentro dos parâmetros
                 //System.out.println("nota inválida");
                 throw new MinhaExc("nota inválida");
                 /*se a nota estiver incorreta eu gero uma exceção, eu forço a execução de um erro, vantagem: posso criar bibliotecas, classes, 
                 se o método não for do jeito que eu quero ele vai gerar uma exceção 
             }
            */
                    
             nt.verificaNota(nota);
             flag = true;
             
            }catch(MinhaExc erro){ // esse catch pega um método de tratamento de outra classe || é uma exceção específica
                System.out.println(erro.getMessage());
                
            }catch(InputMismatchException erro){
                System.out.println("Você não digitou um inteiro");
                
            }catch (Exception erro){ //exceção específica
                //se não foi digitado o número inteiro ele vai para o catch dando o a mensagem do println
                System.out.println("Deu erro");
                //se estiver errado ela pula a linha 28 sem executar o flag
                /*Ao criar outro catch para tratar algo específico, devo saber duas regras: 1º conhecer as exceções, 
                2º as exceções específicas vem primeiro depois as exceções globais */
            }finally{
                sc.nextLine();
                //faz com que o código continue rodando independente de ter erro ou não, gerando um loop
                /*sem o finally, o código estava guardando o enter na memória de entrada, e assim ficava em um looping de execução,
                como se o usuário estivesse apertando o enter infinitamente*/
            }
        }while((nota<0) || (nota>10) || flag == false);
            System.out.println("A nota digitada:  " + nota);
    
        //código não para de rodar até a pessoa inserir uma nota de 0 á 10, corrigindo as exceções de erro de digitação do usuário 
        
            
        
   
    }
}

