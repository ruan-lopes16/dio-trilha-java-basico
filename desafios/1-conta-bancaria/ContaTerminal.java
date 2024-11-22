// conhecer e importar a classe Scanner
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in); // chamando classe Scanner para minha função

        System.out.println("--------------------------------"); // saudação
        System.out.println("Bem-vindo(a) ao banco DIO JAVA!");
        System.out.println("--------------------------------");

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scanner.nextLine();   // coleta nome completo do cliente, do tipo String, nextLine() para ler linha completa

        System.out.println("Digite a agência com digito:");
        String agencia = scanner.nextLine(); // coleta agencia, do tipo String, pois não tem apenas números. nextLine() para ler linha completa

        System.out.println("Digite o número da conta:");
        int conta = scanner.nextInt(); // coleta o número da conta do cliente, do tipo int, pois é um valor inteiro

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble(); // coleta o saldo, do tipo double

        // exibe mensagem final
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.%n" +
                "Sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque", nomeCompleto, agencia, conta, saldo);

        // %s são usados para strings
        // %d para inteiros
        // %.2f para números de ponto flutuante com duas casas decimais
        // %n insere uma nova linha.
    }
}