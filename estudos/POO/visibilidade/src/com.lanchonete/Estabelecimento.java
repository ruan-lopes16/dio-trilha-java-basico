package com.lanchonete;

import com.lanchonete.area.cliente.Cliente;
import com.lanchonete.atendimento.Atendente;
import com.lanchonete.atendimento.cozinha.Almoxarife;
import com.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // ações que não precisam estarem disponíveis para toda a aplicação
    /*
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
    */

        // ações que estabelecimento precisa ter ciencia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLanheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();


        /* não precisamos dessa classe no estabelecimento
        Almoxarife almoxarife = new Almoxarife();
         */
        // ações que não precisam estarem disponíveis para toda a aplicação
    /*
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();

    */

        // ações que somente seu pacote cozinha precisa conhecer (default) - apenas o pacote `atendimento.cozinha` conhece esses métodos
        // por isso o erro
    //  almoxarife.entregarIngredientes();
    //  almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        atendente.servindoMesa();
    // atendente.pegarlancheCozinha();
        atendente.receberPagamento();

        // ação que somente o seu pacote cozinha precisa conhecer (default)
        // estabelecimento não precisa pedir para realizar a troca
    //  atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // não deveria, mas o estabelecimento ainda não definiu as normas de atendimento
    //  cliente.pegarPedidoBalcao(); - removido

        // ação sigiliosa, que tal privada?
    // cliente.consultarSaldoApp();

        // já pensou os clientes ouvindo que o gás acabou?
    /*
        cozinheiro.pedirParaTrocarGas(atendente); // reponsável pela troca do das nesse caso é o Almoxarife
        cozinheiro.pedirParaTrocarGas(almoxarife);

     */
    }
}