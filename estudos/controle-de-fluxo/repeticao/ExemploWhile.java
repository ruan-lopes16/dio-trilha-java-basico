// while testa a condição antes de executar o código
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 50.00; // declara mesada
        while(mesada > 0) { // enquanto mesada maior que 0 (zero)
            Double valorDoce = valorAleatorio(); // pega doce com algum valor aleatorio

            if( valorDoce > mesada ) { // se o valor do doce maior que o da mesada
                valorDoce = mesada; // o doce é igual a mesada
            }

            System.out.println( "Doce do valor: " + valorDoce + " Adicionado no carrinho" );
            mesada = mesada - valorDoce; // subtração da mesada, por o que sobrou da mesada menos o valor do doce

        }
        System.out.println( "Mesada:" + mesada ); // o que sobrou da mesada
        System.out.println( "Joãozinho gastou toda a sua mesada em doces" );
    }

    private static double valorAleatorio() { // metodo valorAleatorio() que me retorna um double
        return ThreadLocalRandom.current().nextDouble(2, 8); // me da um valor aleatorio entre 2 e 8
    }
}