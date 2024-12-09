package com.lanchonete.atendimento.cozinha;

public class Almoxarife {

    private void controlarEntrada(){
        System.out.println("Controlando a entrada dos itens");

    }

    private void controlarSaida(){
        System.out.println("Controlando a saída dos itens");

    }
    // sem o public, pois precisa estar visivel apenas para o seu pacote - forma default
    void entregarIngredientes(){
        System.out.println("Entregando ingredientes");
        controlarSaida();   // ao entregar ingrediente - automaticamente precisa controlar a saida

    }
    // sem o public, pois precisa estar visivel apenas para o seu pacote - forma default
    void trocarGas(){
        System.out.println("Almoxarife trocando o gás");
    }

}