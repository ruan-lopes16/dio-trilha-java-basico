public class ExBreakContinue {
    public static void main( String[] args ) {

        // ex.: break
        for( int numero = 1; numero <=5; numero ++ ){   // determinou se 1 a 5, porém...
            if( numero == 3 ) {                         // condição diz que quando chegar no 3
                break;                                  // o comando para
            }

            System.out.println( numero );               // 1 , 2

        }

        // ex.: continue
        for( int num = 1; num <=5; num ++ ){ // determinou contagem de 1 a 5
            if( num == 3 ) {                            // condição diz que quando o numero chegar a 3
                continue;                                   // vai continuar o comando
            }

            System.out.println( num );                  // 1 , 2 , 4 , 5

            /*
            O número 3 não é impresso porque, quando a condição num == 3 é verdadeira,
            a instrução continue faz com que o loop pule para a próxima iteração,
            ignorando a instrução System.out.println(num).

            Exemplo Visual:
            1 (impresso)
            2 (impresso)
            3 (pulado)
            4 (impresso)
            5 (impresso)
             */

        }

    }
}