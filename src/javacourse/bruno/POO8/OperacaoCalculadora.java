package javacourse.bruno.POO8;

public class OperacaoCalculadora {
    private static double x;
    private static double y;
    private static double ans;


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getAns() {
        return ans;
    }

    public void setAns(double ans) {
        this.ans = ans;
    }

    public double soma(double a, double b){
        this.x = a;
        this.y = b;
        this.ans = a + b;
        return this.ans;
    }

    public double sub(double a, double b){
        this.x = a;
        this.y = b;
        this.ans = a - b;
        return this.ans;
    }

    public double multi(double a, double b){
        this.x = a;
        this.y = b;
        this.ans = a * b;
        return this.ans;
    }

    public double div(double a, double b){
        this.x = a;
        this.y = b;
        this.ans = a / b;
        return this.ans;
    }
}
