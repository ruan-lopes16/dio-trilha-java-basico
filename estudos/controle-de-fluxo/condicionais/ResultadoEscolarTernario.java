// condição ternária - ?

public class ResultadoEscolarTernario {
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado"; // condição verdadeira : condição falsa
        System.out.println( resultado );

        // OU
        int nota1 = 6;
        String resultado1 = nota1 >= 7 ? "Aprovado" : nota1 >= 5 && nota1 < 7 ? "Recuperação" : "Reprovado"; // codição verdadeira : condição ? condição verdadeira : condição falsa
        System.out.println( resultado1 );

    }
}
