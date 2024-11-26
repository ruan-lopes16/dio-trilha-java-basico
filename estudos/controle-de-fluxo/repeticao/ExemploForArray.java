public class ExemploForArray {
    public static void main( String [] args ){
        String alunos[] = { "Felipe", "Jonas", "Camila", "Marcos"}; // declarando um array

        for ( int x = 0; x < alunos.length; x++ ) { // percorre o tamanho(length) do array
            System.out.println( "O Aluno no índice x = " + x + " é " + alunos[x]);
        }
    }
}
