package temas.listaEncadeada;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");

        System.out.println(minhaListaEncadeada.get(0)); // teste1
        System.out.println(minhaListaEncadeada.get(1)); // teste2
        System.out.println(minhaListaEncadeada.get(2)); // teste3
        System.out.println(minhaListaEncadeada.get(3)); // teste4

        System.out.println(minhaListaEncadeada); // [No{ conteudo = teste1}] ---> [No{ conteudo = teste2}] ---> [No{ conteudo = teste3}] ---> [No{ conteudo = teste4}] ---> null

        minhaListaEncadeada.remove(3); // remove o teste4

        System.out.println(minhaListaEncadeada); // [No{ conteudo = teste1}] ---> [No{ conteudo = teste2}] ---> [No{ conteudo = teste3}] ---> null

    }
}
