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

    // Relacionais
    // verificação de strings
        String nomeUm = "Ruan";
        String nomeDois = "Ruan";
        String nomeTres = new String("Ruan"); // criando novo objeto ou textos

        System.out.println(nomeUm == nomeDois); // true
        System.out.println(nomeUm == nomeTres); // false
        System.out.println(nomeUm.equals(nomeTres)); // true // metodo .equals() - compara conteudos
    //
        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA"); // novo objeto de texto
        System.out.println(nome1 == nome3); //false - sao objetos diferentes

        String nome4 = nome3;
        System.out.println(nome3 == nome4); //true

        //equals na parada
        System.out.println(nome1.equals(nome2)); // true
        System.out.println(nome2.equals(nome3)); // true
        System.out.println(nome3.equals(nome4)); // true

        // verificação de numeros
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira!");
        }
        System.out.println("numeroUm é igual a numeroDois? " + simNao); // falso

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente a numeroDois? " + simNao); // true

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao); // false

        // comparacoes
        if(numero1 > numero2) {
            System.out.print("Numero 1 maior que numero 2\n");
        }
        if(numero1 <numero2) {
            System.out.print("Numero 1 menor que numero 2\n");
        }
        if(numero1 >= numero2) {
            System.out.print("Numero 1 maior ou igual que numero 2\n");
        }
        if(numero1 <= numero2) {
            System.out.print("Numero 1 menor ou igual que numero 2\n");
        }
        if(numero1 != numero2) {
            System.out.print("Numero 1 é diferente de numero 2\n");
        }

    // Lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if ( condicao1 && condicao2 ) {
            System.out.println("As duas condições são verdadeiras\n"); // false
        }

        if ( condicao1 || condicao2 ) {
            System.out.println("Umas das condições é verdadeira\n"); // true
        }

        System.out.println("Fim");

        // lógico avançado
        int num1 = 1;
        int num2 = 1;

        if ( num1 == 2 && num2 ++ == 2 ){
            System.out.println("As duas condições são verdadeiras");
        }
        System.out.println("O número 1 agora é " + num1);
        System.out.println("O número 2 agora é " + num2);
    }
}