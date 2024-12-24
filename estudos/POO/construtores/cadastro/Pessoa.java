package cadastro;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // construtor
    // o nome deve ser igual ao nome da classe
    // toda vez que eu quiser criar uma pessoa, já tenho que informar o nome e o cpf da pessoa
    public Pessoa (String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    // cade o setter? definido na a partir da linha 9

    public String getCpf() {
        return cpf;
    }
    // cade o setter? definido na a partir da linha 9

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}