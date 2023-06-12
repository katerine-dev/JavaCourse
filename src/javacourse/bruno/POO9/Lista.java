package javacourse.bruno.POO9;

// public abstract class = classe abstrata
public interface Lista {
    // sem chaves
    public boolean inserirElemento(double valor, int posicao);
    public double lerElemento(int posicao) throws Exception;
    public boolean removerElemento(int posicao);
    public void imprimir();
    public int length();
}
