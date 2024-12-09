package escola;

public class Escola {
    public static void main(String[] args) {
        /*
        Aluno aluno = new Aluno();
        aluno.nome = "Ruan";
        aluno.idade = 21;
        System.out.println("O aluno " + aluno.nome + " tem " + aluno.idade + " anos.");
        */

        // de acordo com JavaBeans
        Aluno aluno = new Aluno();
        aluno.setNome("Ruan");
        aluno.setSexo("Masculino");
        aluno.setIdade(21);

        System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos.");

    }
}