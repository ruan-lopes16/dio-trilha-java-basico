package temas.listaEncadeada;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    // construtor padrao
    public ListaEncadeada(){ // ao instanciar a classe ela recebe um null
        this.referenciaEntrada = null;
    }

    // add
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);

        if (this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAux = referenciaEntrada;
        for(int i = 0; i < this.size()-1; i++){
            noAux = noAux.getProximoNo();
        }
        noAux.setProximoNo(novoNo);
    }

    // getNo
    private No<T> getNo(int index){

        validarIndice(index);

        No<T> noAux = referenciaEntrada;
        No<T> noRetorno = null;

        for(int i = 0; i <= index; i++){
            noRetorno = noAux;
            noAux = noAux.getProximoNo();
        }
        return noRetorno;
    }

    // get
    public T get(int index){
        return getNo(index).getConteudo();
    }

    // remove
    public T remove(int index){
        No<T> noPivo = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }

        No<T> noAnterior = getNo(index -1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }

    // size
    public int size(){
        int tamanhoLista = 0; // iniciando com 0 (zero)

        No<T> referenciaAux = referenciaEntrada;

        while(true){
            if(referenciaAux != null){
                tamanhoLista++;

                if (referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();

                } else {
                    break;

                }
            } else {
                break;

            }
        }

        return tamanhoLista; // retornando o tamanho da lista
    }

    // validar o indice
    private void validarIndice(int index){
        if(index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + ".");
        }
    }

    // isEmpty
    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    // toString
    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAux = referenciaEntrada;
        for (int i = 0; i < this.size(); i++){
            strRetorno += "[No{ conteudo = " + noAux.getConteudo() + "}] ---> ";
            noAux = noAux.getProximoNo();
        }
        strRetorno += null;
        return strRetorno;
    }
}
