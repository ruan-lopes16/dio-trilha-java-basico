package produto;

public class ProdutoTestar {
    public static void main(String[] args) {

        // construtor padrão - sem parametro
        Produto produto1 = new Produto();
        // como está sem valor eu consigo atribuir valores
        produto1.nome = "PC";
        produto1.marca = "Ryzen";
        produto1.valor = 10000.00f;

        // construtor de dois parametros
        Produto produto2 = new Produto("IPhone", "Apple");
        // definindo valor - "manualmente"
        produto2.valor = 4000.00f;

        // construtor de tres parametros
        Produto produto3 = new Produto("UP!", "VW", 38000.00f);

        // exibindo valores
        // produto1
        System.out.println(
                "Nome: " + produto1.nome + "\n" +
                "Marca: " + produto1.marca + "\n" +
                "Valor: R$" + produto1.valor + "\n\n");
        // produto2
        System.out.println(
                "Nome: " + produto2.nome + "\n" +
                        "Marca: " + produto2.marca + "\n" +
                        "Valor: R$" + produto2.valor + "\n\n");
        // produto3
        System.out.println(
                "Nome: " + produto3.nome + "\n" +
                        "Marca: " + produto3.marca + "\n" +
                        "Valor: R$" + produto3.valor + "\n\n");
    }
}