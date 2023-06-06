/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacourse.bruno.POO7;

/**
 *
 * @author jenni
 */
public class Notas {
    
    public Notas(){}
    /*
    public boolean verificaNota(int nota) {
        if((nota<0) || (nota>10)){
            return false;
        }else{
            return true;
        }
    }
    */
    
    public void verificaNota(int nota) throws MinhaExc{
        if((nota<0) || (nota>10)){
            throw new MinhaExc("Nota inválida.....");
        }
    }
}
