import java.util.Scanner;

/*
Crie um programa que leia a idade de uma pessoa e determine se ela é maior de idade ou menor de idade.
Considere que a maioridade começa aos 18 anos.
*/
public class condIdade {
    public static void main(String[] args) {

        System.out.println("----------");
        System.out.println("MAIORIDADE");
        System.out.println("----------\n");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.printf("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá, ".concat(nome));
        if (idade > 18){
            System.out.println("Você tem " + idade + " anos. Portando, já atingiu a maioridade!");
        } else {
            System.out.println("Você tem " + idade + " anos. Portando, ainda NÃO atingiu a maioridade!");
        }

        scanner.close();

    }
}