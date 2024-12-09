package com.lanchonete.atendimento.cozinha;


import com.lanchonete.atendimento.Atendente;

public class Cozinheiro {
    //pode ser default
    public void adicionarLanheNoBalcao() {
        System.out.println("Adicionando lanche natural ao balcão");

    }
    //pode ser default
    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco ao balcão");

    }
    //pode ser default
    public void adicionarComboNoBalcao() {
        adicionarLanheNoBalcao();
        adicionarSucoNoBalcao();

    }

    private void prepararLanche() {
        System.out.println("Preparando lanche tipo: Hamburguer");

    }

    private void prepararVitamina() {
        System.out.println("Preparando suco");

    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();

    }

    private void selecionarIngredientesLanche() {
        System.out.println("Selecionado: pão, salada, ovo e carne");

    }

    private void selecionarIngredientesVitamina() {
        System.out.println("Selecionado: fruta, leite e suco");

    }
    // somente o cozinheiro precisa fazer e conhecer
    private void lavarIngredientes() {
        System.out.println("Lavando ingredientes");

    }

    private void baterVitaminaLiquidificador() {
        System.out.println("Batendo vitamina no liquidificador");

    }

    private void fritarIngredientesLanches() {
        System.out.println("Retirando a carne e ovo para o hamburguer");

    }
    // o cozinheiro precisa pedir ao Almoxarife para fazer a troca, e não ao atendente
    /*
    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();

    }
*/

    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();

    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();

    }
}