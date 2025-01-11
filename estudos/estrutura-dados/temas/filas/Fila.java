package temas.filas;

public class Fila<T> { // a partir do momento que eu instanciar o primeiro objeto/nó - vai reconhecer que só poderei adc aquele tipo de objeto/no

    private No<T> refNoEntradaFila; // entrando na fila pelo final

    // construtor
    public Fila() {
        this.refNoEntradaFila = null; // ao instanciar uma fila, ja instancia ela vazia (null)

    }

    // verificação se vazio ou não
    public boolean isEmpty(){
        // se a referencia de entrada for igual a vazio/null é pq está vazia
        return refNoEntradaFila == null? true : false;
    }

    // enfileirar
    public void enqueue(T object){ // recebo um novo nó, novo nó entra na fila
        No novoNo = new No(object); // embutindo
        novoNo.setRefNo(refNoEntradaFila); // a referencia de novo nó, era o antigo ultimo nó. Agora de ultimo é este que acabou de entrar
        refNoEntradaFila = novoNo; // agora a referencia tem q ser desse novo nó

    }

    // retorna o primeiro da fila
    public T first(){
        if(!this.isEmpty()){ //  se a fila nao estiver vazia

            No primeiroNo = refNoEntradaFila; // o primeiro nó recebe a referencia de entrada da fila

            while(true){
                if(primeiroNo.getRefNo() != null){ // se nao for o primeiro
                    primeiroNo = primeiroNo.getRefNo();
                } else { // se for o primeiro para
                    break;
                }
            }
            return (T) primeiroNo.getObject(); // casting
        }
        return null; // se estiver vazia retorna null
    }

    // desenfileirar
    public T dequeue(){
        if(!this.isEmpty()){ //  se a fila nao estiver vazia

            No primeiroNo = refNoEntradaFila; // o primeiro nó recebe a referencia de entrada da fila
            No noAuxiliar = refNoEntradaFila;

            while(true){
                if(primeiroNo.getRefNo() != null){ // se nao for o primeiro
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();

                } else { // se for o primeiro para
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject(); // casting
        }
        return null; // se estiver vazia retorna null
    }

    // toString
    @Override
    public String toString() {
        String stringRetorno = "";

        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No { Objeto = " + noAuxiliar.getObject() + " }] ---> ";

                if (noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();

                } else {
                    stringRetorno += "null";
                    break;

                }
            }

        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}