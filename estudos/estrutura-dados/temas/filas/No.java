package temas.filas;

public class No {

    private Object object; // posso colocar qlqr obejto utilizando a classe Object de java.util
    private No refNo;

    // construtor
    public No(Object object){ // object - conteudo do nó
        this.refNo = null;
        this.object = object;

    }

    public No(){ // padrao

    }

    // get e set

    public Object getObject() {
        return object;
    }
    public void setObject(Object object) {
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
