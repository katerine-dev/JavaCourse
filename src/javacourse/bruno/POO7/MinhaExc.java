/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacourse.bruno.POO7;

/**
 *
 * @author jenni
 */
public class MinhaExc extends Exception {
    private String msg;
    
    public MinhaExc(){
        this.msg = "deu algum erro";
    }
    
    public MinhaExc(String msg){
        this.msg = msg;
    }
    
    @Override //pega um método específico da super clsse e sobrescreve ele na subclasse
    public String getMessage(){
        return this.msg;
    }
}
