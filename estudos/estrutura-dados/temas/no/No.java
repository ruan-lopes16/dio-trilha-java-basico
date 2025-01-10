package temas.no;

public class No {
    private String conteudo;
    private No proximoNo;

    // construtor
    public No(String conteudo) {
        this.proximoNo = null; // referencia para proximo nó = null
        this.conteudo = conteudo;
    }

    // get set
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{ conteudo = '" + conteudo + "' }";
    }
}
