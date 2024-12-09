public class SistemaIbge {
    public static void main(String[] args) {
        //imprimindo os estados existentes no enum
        for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) { // a cada EstadoBrasileiro é igual ao meu EstadoBrasileiro.value
            System.out.println(uf.getSigla() + " - " + uf.getNomeMaiusculo()); // lista sigla e respectivo estado
        }

        //selecionando um estado a partir das opções disponíveis
        EstadoBrasileiro ufSelecionado = EstadoBrasileiro.PIAUI;

        System.out.println("O estado selecionado foi: " + ufSelecionado.getNome() + " - " + ufSelecionado.getNome()); // nome do estado e sigla
        System.out.println("Códido de IBGE: " + ufSelecionado.getIbge());

    }
}