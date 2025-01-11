package temas.filas;

public class No<T> {

    private T object; // posso colocar qlqr obejto utilizando a classe Object de java.util <- antes. AGORA -> GENERICO
    private No<T> refNo;

    // construtor
    public No(T object){ // object - conteudo do nó
        this.refNo = null;
        this.object = object;

    }

    public No(){ // padrao

    }

    // get e set

    public Object getObject() {
        return object;
    }
    public void setObject(T object) {
        this.object = object;
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
                "object = " + object +
                " }";
    }
}
