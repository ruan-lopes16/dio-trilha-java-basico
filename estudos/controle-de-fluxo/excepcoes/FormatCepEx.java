package excepcoes;

public class FormatCepEx {
    public static void main( String[] args ) {
        try {
            String cepFormatado = formatarCep( "2376506" );
            System.out.println( cepFormatado );
        } catch ( CepInvalidoException e ) {
            // throw new RuntimeException( e );
            System.out.println( "O CEP não corresponde com as regras de negócio" );
        }

    }
    // quando eu for formatar um cep - vai verificar...
    static String formatarCep( String cep ) throws CepInvalidoException{
        // se o cep NÃO tiver uma quantidade de 8 numeros
        if( cep.length() != 8 )
            throw new CepInvalidoException(); // lança excecao criada - CepInvalidException

        //simulando um cep formatado
        return "23.765-064";
    }
}
