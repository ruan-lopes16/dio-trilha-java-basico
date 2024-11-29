import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean sucesso = false;

        while (!sucesso){ // enquanto não
            try {
                // pegando os dois numeros via terminal
                System.out.print( "Digite o primeiro número: " );
                int num1 = scanner.nextInt();

                System.out.print( "Digite o segundo número: " );
                int num2 = scanner.nextInt();

                // chamando contagem
                contar(num1, num2);

                sucesso = true; // se não ocorrer exceção, marcar como sucesso

            } catch (ParametrosInvalidosException e) { // exceção
                // mensagem exceção
                System.out.println("ERRO: " + e.getMessage());

            }
        }
        scanner.close(); // fechando scanner após o uso
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {

        if ( num1 > num2 ) { // em caso de num2 maior que num1
            throw new ParametrosInvalidosException("O segundo deve ser maior que o primeiro");
        }
        if (num1 < 0 || num2 < 0) { // em caso de num1 ou num2 negativos
            throw new ParametrosInvalidosException("Os números não podem ser negativos");
        }

        System.out.println("Segue contagem:");
        // criando loop para de interações de num1 até num2
        for (int count = num1; count <= num2; count++) {
            System.out.println(count);

        }
    }
}