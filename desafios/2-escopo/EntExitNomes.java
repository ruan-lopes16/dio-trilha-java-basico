import java.util.Scanner;
public class EntExitNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cria um array de strings para armazenar 10 nomes
        String[] nomes = new String[10];

        // Lê os 10 nomes e armazena no array
        for(int i = 0; i < 10; i++) {
            nomes[i] = sc.nextLine(); // lê um nome e armazena no array
        }

        // Imprime o terceiro nome (índice 2)
        System.out.println(nomes[2]); // terceiro - índice 2

        // Imprime o sétimo nome (índice 6)
        System.out.println(nomes[6]); // sétimo - índice 6

        // Imprime o nono nome (índice 8)
        System.out.println(nomes[8]); // nono - índice 8

        // Fecha o scanner
        sc.close();
    }
}
