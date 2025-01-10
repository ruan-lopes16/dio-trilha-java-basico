package temas.atribuicaoReferencia;

public class Main {
    public static void main(String[] args) {

        // atribuicao de primitivo

        System.out.println("\nAtribuição de tipos primitivos");
        int intA = 1;
        int intB = intA;

        System.out.println("intA: " + intA + ", intB: " + intB); // 1, 1
        intA = 2;
        System.out.println("intA: " + intA + ", intB: " + intB); // 2, 1

        System.out.println("\n======================\n");
        System.out.println("Atribuição de objetos");

        // atribuicao de objetos
        MeuObj objA = new MeuObj(1); // criando o objeto atraves do construtor
        MeuObj objB = objA; // copia a referencia de memoria do objA, aponta para o mesmo ENDEREÇO de memoria

        System.out.println("objA = " + objA + ", objB = " + objB); // 1, 1
        objA.setNum(2); // alterando o objeto A
        System.out.println("objA = " + objA + ", objB = " + objB); // 2, 2
    }
}
