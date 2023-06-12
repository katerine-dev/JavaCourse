package javacourse.bruno.POO9;


public class VetorLista implements Lista {
    private double[] vetor;
    private int tamLista;


    public VetorLista(){
        this.vetor = new double[100];
        this.tamLista = 0;
    }

    @Override
    public boolean inserirElemento(double valor, int posicao) {
        if((posicao < 0) || (posicao> this.length())){
            return false;
        } else if ((posicao == 0) && (this.length() == 0)){
            this.vetor[0] = valor;
            this.tamLista++;
            return true;
        } else if (this.length() > 0) {
            for (int i = this.length(); i >= posicao; i--){
                vetor[i+1] = vetor[i];
            } vetor[posicao] = valor;
            this.tamLista++;
            return true;
        } else if (posicao == this.length()){
            vetor[posicao] = valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double lerElemento(int posicao) throws Exception {
        if((this.validaPosicao(posicao))){
            return this.vetor[posicao];
        } else {
            throw new Exception("Posicao inválida");
        }
    }

    @Override
    public boolean removerElemento(int posicao) {
        throw new UnsupportedOperationException("Not Supported yet.");
    }

    @Override
    public void imprimir() {
        for(int i = 0; i < this.length(); i++){
            System.out.println("Elemento[" + i + "]" + this.vetor[i]);
        }
        System.out.println("-----------------------------");
    }

    @Override
    public int length() {
        return this.tamLista;
    }

    private boolean validaPosicao(int posicao){
        return !((posicao < 0) || (posicao > this.length()));
    }
}
