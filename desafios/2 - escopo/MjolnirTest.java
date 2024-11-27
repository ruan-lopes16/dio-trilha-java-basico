import java.util.Scanner;

public class MjolnirTest {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("testes");
        int teste = leitor.nextInt();
        String nome;
        int N; // força Newton

// TODO: complete os espaços em branco com sua solução para o problema

        for (int i = 0; i < teste; i++) {
            System.out.println("nome");
            nome = leitor.next();

            System.out.println("força");
            N = leitor.nextInt();

            if (nome.equals("Thor")) System.out.println("Y");
            else System.out.println("N");
            break;
        }
    }
}