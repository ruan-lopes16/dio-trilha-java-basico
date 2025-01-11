package temas.filas;

public class Main {
    public static void main(String[] args) {

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));
        System.out.println(minhaFila); // ver fila

        System.out.println(minhaFila.dequeue()); // pegando/tirando o primeiro
        System.out.println(minhaFila); // sem o primeiro

        minhaFila.enqueue(new No("ultimo"));
        System.out.println(minhaFila); // ultimo entrará após o quarto

        System.out.println(minhaFila.first());// ver o primeiro que está na fila
        System.out.println(minhaFila);

    }
}
