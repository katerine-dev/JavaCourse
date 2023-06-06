package javacourse.bruno.POO6;

public class Calculadora {
    private static double a;
    private static double b;
    private static double ans;

    private String dono;

    // método padrão reseta os valores
    public Calculadora(){
        this.dono = "ze";
        this.a = 0;
        this.b = 0;

    }
    // método construtor
    public Calculadora(double a, double b){
        this.dono = "maria";
        this.a = a;
        this.b= b;
    }

    public Calculadora(String dono, double a, double b){
        this.dono = "dono";
        this.a = a;
        this.b= b;
    }


    public static double getA() {
        return a;
    }

    public static void setA(double a) {
        Calculadora.a = a;
    }

    public static double getB() {
        return b;
    }

    public static void setB(double b) {
        Calculadora.b = b;
    }

    public static double getAns() {
        return ans;
    }

    public static void setAns(double ans) {
        Calculadora.ans = ans;
    }

    public void print() {
        System.out.println("Dono: " + this.dono);
        System.out.println("a: " + this.a);
        System.out.println("b: " + this.b);
        System.out.println("ans: " + this.ans);
        System.out.println("--------------------");
    }

}
