public class Main {
    public static void main(String[] args) {
        // criando um titular
        Titular ruan  = new Titular();
        ruan.setNome("Ruan");

        // criando conta corrente
        Conta cc = new ContaCorrente(ruan); // ja cria agencia e numero
        cc.depositar(100); // tinha 100

        // criando conta poupança
        Conta cp = new ContaPoupanca(ruan);
        cc.transferir(50, cp); // dos 100 transferi 50 para outra conta

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}