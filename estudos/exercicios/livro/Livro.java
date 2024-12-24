package livro;/*
Crie uma classe livro.
Livro com os seguintes atributos: título (String), autor (String) e ano de publicação (int).
Implemente um método para exibir as informações do livro.
No método main, crie objetos dessa classe e exiba as informações de cada livro.
 */

public class Livro {
    // atributos
    String titulo;
    String autor;
    int anoPub;

    //getters e setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPub() {
        return anoPub;
    }
    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }
}
