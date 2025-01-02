public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1; // agencia nao irá mudar
    private static int SEQUENCIAL = 1; // a sequencia começará em 1 e irá implementando a cara nova conta corrente ou poupança

    protected int agencia;
    protected int numConta;
    protected double saldo;
    protected Titular titular;


    public Conta(Titular titular) {
        this.agencia = AGENCIA_PADRAO; // numero padrao, definido em Conta
        this.numConta = SEQUENCIAL++; // é definido "automaticamente"
        this.titular = titular;
    }

    // construtor de acordo com IConta
    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor); // a conta q está chamando transferir - eu saco o valor e...
        contaDestino.depositar(valor); // ...deposito na conta destino
    }

    // getters
    public int getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfoConta(){
        System.out.println(String.format("Titular: %s", this.titular.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número da conta: %d", this.numConta));
        System.out.println(String.format("Saldo: R$%.2f", this.saldo));
    }
}