package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println( "Processo Seletivo" );
        // selecaoCandidatos();
        // imprimirSelecionados();
        String[] candidatos = {"Ruan", "Patrick", "Hyan", "Daniel", "Johnny"}; // Ex. de candidatos selecionados
        for ( String candidato : candidatos ) {
            entrandoEmContato( candidato );
        }

        /*analisarCandidato( 1900.0 ); // Ligar para o candidato.
        analisarCandidato( 2200.0 ); // Aguardando o resultado demais candidatos...
        analisarCandidato( 2000.0 ); // Aguarando o resultado dos demais candidadatos*/
    }

    static void entrandoEmContato( String candidato ){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if ( continuarTentando ){
                tentativasRealizadas ++;

            } else {
                System.out.println( "Contato realizado com SUCESSO!" );

            }

        } while (continuarTentando && tentativasRealizadas < 3 );

        if ( atendeu ){
            System.out.println( "Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "° tentativa" );

        } else {
            System.out.println( "NÃO conseguimos contato com " + candidato + ". Número máximo de tentativas " + tentativasRealizadas + " realizadas." );
        }

    }

    // metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1; // se o valor entre 1 e 3, for igual a 1, a pessoa atendeu

    }

    //
    static void selecaoCandidatos() {
        String[] candidatos = {"Ruan", "Patrick", "Hyan", "Daniel", "Johnny", "William", "Vitor", "João", "Isaque", "Carlos"};

        int candidatosSelecionados = 0; // qtd de candidatos selecionados
        int candidatosAtual = 0; // variavel de inicio de array
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) { // enquanto a qtd de selecionados for menor que 5 && enquanto tiver candidatos no array de candidatos
            String candidato = candidatos[candidatosAtual]; // o meu candidato é igual aos candidatos do array candidatosAtual
            double salarioPretendido = valorPretendido(); // usa metodo para auxiliar no valor `valorPretendido()`

            System.out.println("O candidato " + candidato + " solicitou esse valor de salário R$" + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++; // adicionado + 1 ao array de SELECIONADOS

            } else {
                System.out.println("O candidato " + candidato + " NÃO foi selecionado");

            }

            candidatosAtual++; // adicionado + 1 no array dos PARTICIPANTES // PROXIMOO
        }
    }

    // TODO: terei que estudar mais para implentar isso daqui
    /*static void imprimirSelecionados() {
        String [] candidatosSelecionados;
        System.out.println( "Imprimindo a lista de candidatos informando o índice do elemento" );

        for ( int indice = 0; indice < candidatosSelecionados.length; indice++ ){
            System.out.println( "O candidato de n°" + (indice + 1) + " é o " + candidatosSelecionados[indice]);
        }

        // forma abreviada de interação foreach
        for ( String candidato : candidatosSelecionados ){
            System.out.println( "O candidato selecionado foi " + candidato );
        }
    }*/

    // metodo random para valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble( 1800, 2200 );

    }

    // metodo antes de implimentar algoritmo
    static void analisarCandidato( double salarioPretendido ) { // metodo estatico que não retorna nenhuma opção (inicialmente) + parametro
        double salarioBase = 2000.0;

        if ( salarioBase > salarioPretendido ) {
            System.out.println( "Ligar para o candidato." );

        } else if ( salarioBase == salarioPretendido ) {
            System.out.println( "Ligar para o candidato com contraproposta!" );

        } else {
            System.out.println( "Aguardando o resultado dos demais candidatos..." );
        }

    }
}