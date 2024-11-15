import java.util.Date; // importando PACKAGE - para não dar erro no Date

public class Operadores {
    public static void main ( String [] args ){
        String nome = "Ruan";
        int idade = 21;
        double peso = 54.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(); // classe que representa um tipo - antecede new -> nome da classe correspondentes

    // Aritméticos
        double soma = 10.5 + 15.7;  // 26.2
        int subtração = 113 - 25;   // 138
        int multiplicacao = 20 * 7; // 140
        int divisao = 15 / 3;   // 5
        int modulo = 18 % 3;    // 0
        double total = (10 * 7) + (20/4);   // 75

    // Contatenação - junção
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto); // LINGUAGEMJAVA

        String concatenacao ="?";
        System.out.println(concatenacao); // ?

        concatenacao = 1+1+1+"1"; // 1 representa String nesse momento
        System.out.println(concatenacao); // 31

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao); // 1111 - virou texto

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao); // 1111 - numero com texto

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao); // 1111 - decteta o primeiro tipo e 'transforma' o restante

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao); // 13 - uma string e o restante numeros em evidencia

    // Unários - anotados no Obesidian
        int numero = 5;
        System.out.println(- numero); // -5 -> inverte o valor
        System.out.println(numero); // 5

        numero = - numero; // número = ele msm de forma negativo - até que haja uma nova iteração
        System.out.println(numero); // -5

        //numero = + numero; // errado, pois o + nesse caso somente aritmetico
        numero = numero * 1;
        System.out.println(numero); // 5 - volta para positivo

    // Incremento
        int num = 5;
        // numero = numero ++;
        num++; // 5++ = 5 + 1
        System.out.println(num); // 6

        System.out.println(num ++); // 5 // abreviação do valor e depois incrementa
        System.out.println(num); // 6 // agora fez o incremento

        System.out.println(++ num); // 7 // faz o incremento antes de exibir, assim, deixando "certo" o programa

    // Decremento
        System.out.println(num --); // 7, ainda não fez o decremento
        System.out.println(num); // 6, decremento feito

    // Booleanos
        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro); // false
        System.out.println(verdadeiro); // true

        verdadeiro = !verdadeiro; // falsa até uma nova iteração - "verdadeiro = false"
        System.out.println(verdadeiro); // false

    // Ternário "?"
        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";
        /*
        String resultado = "";  // inicialmente vazio
        if( a == b )
            resultado = "verdadeiro";
        else
            resultado = "falso";
        */
        System.out.println(resultado); // falso
    }
}