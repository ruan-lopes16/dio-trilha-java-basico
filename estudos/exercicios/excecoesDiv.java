import java.util.Scanner;

/*
Crie um programa que leia dois números inteiros e realize a divisão entre eles.
Caso o segundo número seja zero, o programa deve lançar uma exceção personalizada,
informando que não é possível dividir por zero, e pedir para o usuário tentar novamente.
 */

class DivPorZeroException extends Exception {
    public DivPorZeroException(String message){
        super(message);
    }
}

public class excecoesDiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------");
        System.out.println("DIVISÃO");
        System.out.println("-------\n");

        int dividendo, divisor;
        double divisao;

        // laço para solicitar os números até que o divisor seja diferente de zero
        while (true) {
            System.out.println("Digite o dividendo: ");
            dividendo = scanner.nextInt();

            System.out.println("Digite o divisor: ");
            divisor = scanner.nextInt();

            // verifica se divisor é zero
            if (divisor == 0) {
                try {
                    throw new DivPorZeroException("Não é possível dividir por 0(zero). Tente novamente");
                } catch (DivPorZeroException e) {
                    System.out.println(e.getMessage());
                    continue; // solicita os numeros novamente
                }
            }

            divisao = (double) dividendo / divisor;
            System.out.println("Resultado da divisão: " + divisao);
            break; // sai do laço se a divisão for realizada

        }
        scanner.close();
    }
}
