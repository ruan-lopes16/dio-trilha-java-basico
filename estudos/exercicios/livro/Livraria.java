package livro;

public class Livraria extends Livro {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println("BEM-VINDO(A) À LIVRARIA JAVA BOYS");
        System.out.println("---------------------------------\n");

        Livro livro1 = new Livro();

        livro1.setTitulo("JAVA Developer");
        livro1.setAutor("Prof. Gleyson");
        livro1.setAnoPub(2022);

        System.out.println("Título: " + livro1.getTitulo() +
                "\nAutor: " + livro1.getAutor() +
                "\nAno de Publicação: " + livro1.getAnoPub() + "\n"
        );

        Livro livro2 = new Livro();

        livro2.setTitulo("Java Iniciantes");
        livro2.setAutor("DIO");
        livro2.setAnoPub(2018);

        System.out.println("Título: " + livro2.getTitulo() +
                "\nAutor: " + livro2.getAutor() +
                "\nAno de Publicação: " + livro2.getAnoPub() + "\n"
        );

    }
}