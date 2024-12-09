package produto;

public class Produto {

    // atributos
    String nome;
    String marca;
    float valor;

    // construtores
    Produto() {
        // assim consigo criar um objeto sem definir parametros
    }

    Produto (String nome){ // produto com parametro
        this.nome = nome; // esse nome(declarado anteriormente - atributo), recebe o valor da variavel nome

    }

    Produto(String nome, String marca){ // segue mesma lógica do anterior, porém com dois parametros
        this.nome = nome;
        this.marca = marca;

    }

    Produto(String nome, String marca, float valor){ // segue mesma lógica dos anteriores, porém com três parametros
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;

    }
}