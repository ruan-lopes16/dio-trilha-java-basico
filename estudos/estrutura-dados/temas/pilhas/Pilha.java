package temas.pilhas;

public class Pilha {
    private No refNoEntradaPilha;

    // construtor
    public Pilha() {
        this.refNoEntradaPilha = null; // ao instanciar um nó a referencia dele é nula
    }

    // push - acrescenta nó em cima da pilha
    public void push(No novoNo){ // ao dar push -
        No refAuxiliar = refNoEntradaPilha; // guardo referencia de nó topo
        refNoEntradaPilha = novoNo; // pego a referencia de topo e seto ela como novo nó, ou seja, a nova referencia é para o nó que acabei de empilhar
        refNoEntradaPilha.setRefNo(refAuxiliar); // no que acabei de empilhar, se refere à referencia de proximo nó, ou seja, a antiga referencia de topo
    }

    // metodo pop - exclui o primeiro elemento - ultimo colocado na pilha
    public No pop(){
        if(!this.isEmpty()){ // se a pilha nao estiver vazia
            No noPopped = refNoEntradaPilha; // guardo o nó que estou retirando
            refNoEntradaPilha = refNoEntradaPilha.getRefNo(); // e digo que a referencia de nó é o elemento que está logo abaixo do nó que tirei
            return noPopped; // o elemento retirado
        }
        return null;
    }

    // metodo top
    public No top(){
        return refNoEntradaPilha; // apenas me retorna a referencia e nao faz mais nada
    }

    // isEmpty
    public boolean isEmpty(){
        // ternario if
        return refNoEntradaPilha == null ? true : false;

        // se a referencia está nula, não tem pilha
    }

    // toString
    @Override
    public String toString() {
        String stringRetorno = "-------------------\n";
        stringRetorno += "       Pilha\n";
        stringRetorno += "-------------------\n";

        No noAuxiliar = refNoEntradaPilha; // percorrer a pilha e dar print nela
        while (true){
            if (noAuxiliar != null){
                stringRetorno += "[No { dado = " + noAuxiliar.getDado() + " }]\n"; // pegando dando do primeiro nó
                noAuxiliar = noAuxiliar.getRefNo();
            } else{
                break;
            }
        }
        stringRetorno += "==================\n";
        return stringRetorno;
    }
}
