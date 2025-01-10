package temas.generics;

public class RefactorNo<T> { // classe generica
    private T conteudo; // T - é um tipo generico
    private RefactorNo<T> proximoNo;

    // construtor
    public RefactorNo(T conteudo) {
        this.proximoNo = null; // referencia para proximo nó = null
        this.conteudo = conteudo;
    }

    // get set
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public RefactorNo<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(RefactorNo<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{ conteudo = '" + conteudo + "' }";
    }
}
