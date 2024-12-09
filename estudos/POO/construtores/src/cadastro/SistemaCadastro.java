package cadastro;

public class SistemaCadastro {
    public static void main(String[] args) {
        // antes: criando uma pessoa no sistema
        // cadastro.Pessoa ruan = new cadastro.Pessoa();

        Pessoa ruan = new Pessoa("14725803626", "Ruan");

        // definindo o endereço de ruan
        ruan.setEndereco("rua dos Java's boys");

        System.out.println("Nome: " + ruan.getNome() + " - CPF: " + ruan.getCpf());
    }
}