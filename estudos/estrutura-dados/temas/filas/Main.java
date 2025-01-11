package temas.filas;

public class Main {
    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>(); // especificando fila de strings

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");
//      minhaFila.enqueue(5); // erro
        System.out.println(minhaFila); // ver fila

        System.out.println(minhaFila.dequeue()); // pegando/tirando o primeiro
        System.out.println(minhaFila); // sem o primeiro

        minhaFila.enqueue("ultimo");
        System.out.println(minhaFila); // ultimo entrará após o quarto

        System.out.println(minhaFila.first());// ver o primeiro que está na fila
        System.out.println(minhaFila);

        //
        Fila<Integer> minhaFila2 = new Fila<>(); // especificando fila de inteiros

        minhaFila2.enqueue(1);
        minhaFila2.enqueue(2);
        minhaFila2.enqueue(3);
        minhaFila2.enqueue(4);
//      minhaFila2.enqueue("cinco"); // erro

        System.out.println(minhaFila2);

        System.out.println(minhaFila2.dequeue());
        System.out.println(minhaFila2);

        minhaFila2.enqueue(0);
        System.out.println(minhaFila2);

        System.out.println(minhaFila2.first());
        System.out.println(minhaFila2);

    }
}
