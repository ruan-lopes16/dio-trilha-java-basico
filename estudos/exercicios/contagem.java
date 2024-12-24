/*Crie um programa que leia um número inteiro positivo e imprima todos os números pares de 0 até esse número.
Utilize um laço for ou while para resolver.
 */

import java.util.Scanner;

public class contagem {
    public static void main(String[] args) {

        System.out.println("-------------------------");
        System.out.println("CONTAGEM DE NÚMEROS PARES");
        System.out.println("-------------------------\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println("\ncontando...");
        if (num > 0){ // verfica se é positivo

            for (int par = 0; par <= num; par++){
                System.out.println(par);
            }

        } else {
            System.out.println("Insira um número inteiro positivo!");
        }

        scanner.close();

    }
}