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
        double resultado = (10 * 7) + (20/4);   // 75

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

    }
}