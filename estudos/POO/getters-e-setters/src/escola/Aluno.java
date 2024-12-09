package escola;

public class Aluno {
    /*
    String nome;
    int idade;
    */

    // mudando classe nome de acordo com JavaBeans
    private String nome;
    private int idade;
    private String sexo;

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String newSexo) {
        this.sexo = newSexo;
    }

    public String getNome(){
        return nome;

    }
    public void setNome(String newNome){ // recebe com parametro um novo nome - dizendo que este nome é igual ao novo nome
        nome = newNome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int newIdade){ // recebe com parametro um novo idade - dizendo que este idade é igual a nova idade
        this.idade = newIdade;
    }
}
