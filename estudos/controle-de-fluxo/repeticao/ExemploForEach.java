public class ExemploForEach {

    public static void main( String[] args ) {
        String alunos [] =  { "FELIPE","JONAS","JULIA","MARCOS" }; // declarando array

        //Forma abreviada
        for( String aluno : alunos ) { // declara variavel aluno : a cada iteração de alunos o aluno atual - indice atual, obtem novo valor
            System.out.println( "Nome do aluno é:" + aluno );

        }
    }
}
