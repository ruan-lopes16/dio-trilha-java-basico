// condicional simples - IF

public class CaixaEletronicoIf {
    public static void main(String[] args) {

        double saldo = 25.0; //  saldo
        double valorSolicitado = 17.0; // saque

        if( valorSolicitado < saldo ) { // se valor solicitado menor que saldo
            saldo = saldo - valorSolicitado; // faz a subtração do saldo - valorSolicitado

        } // caso o valorSolicitado seja maior, não faz operação

        System.out.println("Saldo atual de R$".concat(String.valueOf( saldo )));
    }
}
