package temas.pilhas;

public class No {

    private int dado; // payload - nó de inteiros
    private No refNo = null; // cria um novo nó - referencia de proximo nó

    // construtor
    public No() {
    }

    public No(int dado) {
        this.dado = dado;
    }

    // get set
    public int getDado() {
        return dado;
    }
    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }
    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    // toString
    @Override
    public String toString() {
        return "No{ " +
                "dado = " + dado +
                " }";
    }
}