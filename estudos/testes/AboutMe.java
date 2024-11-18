/*
TESTE EM TERMINAL
PASSANDO PARAMETROS NO TERMINAL:

Set-Location S:
cd Cursos\DIO\Java-Developer\dio-trilha-java-basico\estudos\testes
dir
java AboutMe.java Ruan Santos 21 1.73
                    // parametros
 */

import java.util.Locale; // ao declarar as classes o IntelliJ já faz um auto-import dos métodos
import java.util.Scanner;

public class AboutMe {

//    public static void main ( String [] args ){
//        //os argumentos começam com indice 0
//        String nome = args [0];
//        String sobrenome = args [1];
//        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
//        double altura = Double.valueOf(args[3]);
//
//        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
//        System.out.println("Tenho " + idade + " anos ");
//        System.out.println("Minha altura é " + altura + "cm ");
//    }

    // classe para entrada de dados - Scanner
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // vira um novo objeto

        System.out.println("Digite seu nome: ");
        String nome = scanner.next(); // converte o valor digitado em string

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next(); // converte o valor digitado em string

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt(); // converte o valor digitado em int

        System.out.println("Digite sua altura(m):" );
        double altura = scanner.nextDouble(); // converte o valor digitado em double

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }

}