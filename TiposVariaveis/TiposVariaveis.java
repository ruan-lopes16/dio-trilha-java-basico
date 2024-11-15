public class TiposVariaveis {
    public static void main ( String[] args ){

    // Tipos
    // int, byte, short, long, float, double, boolean, char"

        // declarando variáveis - mais utilizadas para números
        // tipo nomeVariavel = atribuicaoDeValorOpcional
        int idade; // tipo "int", nome "idade", sem atribuição
        int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.5

    // TipoDados
        byte idadeNovo = 123;

        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo - String
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo - String // L ou l, para representar q é um valor long
        float pi = 3.14F; // F ou f, para representar float
        double salario = 2500.00; // forma correta para mostrar salario

        short numeroCurto = 1;  // +30000
        int numeroNormal = numeroCurto; // isso da certo // inteiro comporta um curto

    /* [ERRO]

        short numeroCurto2 = numeroNormal;

        isso não da certo, pois numeroNormal é 'int', ou seja, ele comporta mais numeros
    */

    // ExemploVariavel
        int numero = 5;
        // valror de numero alterado - não colocou int pois já foi declarado antes o seu tipo
        numero = 10;

        System.out.print( numero );   // 10 - pega sempre o último valor

        /* CONSTANTE
            final - variavel nao esta poderá obter outro valor;
            OU
            colocar o nome da variavel em caixa alta
         */
        final double VALOR_DE_PI = 3.14;

        //VALOR_DE_PI=3.15;
        // Esta linha vai apresentar erro de compilação! - pois não pode ser alterada

    // para textos
        String meuNome = "Ruan";
        System.out.println("\n" + meuNome );

    }
}