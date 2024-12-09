package com.lanchonete.atendimento;

public class Atendente {

    public void servindoMesa(){
        pegarlancheCozinha(); // antes de servir a mesa, precisa pegar o lanche
        System.out.println("Servindo a mesa");

    }

    private void pegarlancheCozinha(){
        System.out.println("Pegando lanche na cozinha");

    }

    public void receberPagamento(){
        System.out.println("Recebendo pagamento");

    }
    // sem o public, pois precisa estar visivel apenas para o seu pacote - forma default
    void trocarGas(){
        System.out.println("Atendente trocando o gás");

    }

    private void pegarPedidoBalcao(){
        System.out.println("Pegando pedido no balão");

    }

}