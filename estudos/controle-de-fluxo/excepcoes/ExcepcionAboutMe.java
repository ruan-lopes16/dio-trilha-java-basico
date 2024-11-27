// try - catch

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExcepcionAboutMe {
    public static void main( String[] args ) {

        try {
            Scanner scanner = new Scanner( System.in ).useLocale( Locale.US );

            System.out.println( "Digite seu nome: " );
            String nome = scanner.nextLine();

            System.out.println( "Digite seu sobrenome: " );
            String sobrenome = scanner.nextLine();

            System.out.println( "Digite sua idade" );
            int idade = scanner.nextInt();

            System.out.println( "Digite sua altura(m):" );
            Double altura = scanner.nextDouble();

            System.out.println( "Olá me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() );
            System.out.println( "Tenho " + idade + " anos" );
            System.out.println( "Minha altura é " + altura + "cm" );
            scanner.close();

        } catch ( InputMismatchException e ) {
            // System.out.println( "Os campos idade e altura, precisam ser númerícos!" );
            System.err.println( "Os campos idade e altura precisam ser númericos!" ); // forma de mostrar que é um erro em uma saída - `err`

        }

    }
}