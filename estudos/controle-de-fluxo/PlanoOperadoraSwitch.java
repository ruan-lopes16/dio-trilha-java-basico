// SWITCH CASE - caso bem aplicado
/*
- O sistema terá 03 planos: BASIC, MIDIA e TURBO
- BASIC(B): 100 minutos de ligação
- MIDIA(M): 100 minutos de ligação + Whats e Intagram grátis
- TURBO(T): 100 minutos de ligação + Whats e Intagram grátis + 5Gb Youtube
 */

public class PlanoOperadoraSwitch {

    public static void main(String[] args) {
        /* caso tradicional
        String plano = "M";

        if ( plano == "B" ) {
            System.out.println( "100 minutos de ligação" );

        } else if (plano == "M") {
            System.out.println( "100 minutos de ligação" );
            System.out.println( "Whats e Instagram grátis" );

        } else if ( plano == "T" ) {
            System.out.println( "100 minutos de ligação" );
            System.out.println( "Whats e Instagram grátis" );
            System.out.println( "5Gb Youtube" );

        }
         */

        String plano = "M";

        switch ( plano ) {
            case "T": {
                System.out.println( "5Gb Youtube" );
            }
            case "M": {
                System.out.println( "Whats e Instagram grátis" );
            }
            case "B": {
                System.out.println( "100 minutos de ligação" );
                break;
            }
            default:
                System.out.println( "Nenhum plano selecionado" );
        }
    }
}