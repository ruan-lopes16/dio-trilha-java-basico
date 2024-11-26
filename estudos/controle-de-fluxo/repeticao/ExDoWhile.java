//testa a condição após executar o código - é executado pelo menos uma vez
import java.util.Random;

public class ExDoWhile {
    public static void main(String[] args) {
        System.out.println( "Discando..." );

        do {
            //excutando repetidas vezes até alguém atender
            System.out.println( "Telefone tocando" );

        } while( tocando() ); // enquanto tiver tocando "Telefone tocando"

        // quando parar de tocar
        System.out.println( "Alô !!!" );
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt( 3 ) == 1; // se o valor aleatorio entre um e tres, for 1...
        System.out.println( "Atendeu? " + atendeu ); // ... quer dizer que ele atendeu
        return ! atendeu; //negando o ato de continuar tocando
    }
}