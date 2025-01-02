public class ContaPoupanca extends Conta {

    public ContaPoupanca(Titular titular) {
        super(titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfoConta();
    }
}