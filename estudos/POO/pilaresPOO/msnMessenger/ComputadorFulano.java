package msnMessenger;

// simulação classe de uso
public class ComputadorFulano {
    public static void main(String[] args) {
        // abrindo MSN
        MSNMessenger msn = new MSNMessenger();

        msn.validarConectadoInternet();
        msn.enviarMensagem();
        msn.salvarHistoricoMensagem();

        msn.receberMensagem();
    }
}