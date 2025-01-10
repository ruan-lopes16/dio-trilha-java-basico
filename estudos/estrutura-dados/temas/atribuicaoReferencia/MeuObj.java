package temas.atribuicaoReferencia;

public class MeuObj {
    Integer num;

    // construtor
    public MeuObj(Integer num) {
        this.num = num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override                   // modificando o num para uma String
    public String toString() {
        return this.num.toString();
    }
}
