package msnMessenger.apps;

public class MSNMessenger extends ServicoMsgInstantanea {

    // implementando os metodos abstratos
    @Override
    public void enviarMensagem() {
        validarConectadoInternet(); // antes de enviar msg valida se está conectado
        System.out.println("Enviando mensagem pelo MSN");
    }

    @Override
    public void receberMensagem() {
        salvarHistoricoMsg();
    }

    @Override
    public void salvarHistoricoMsg() {
        System.out.println("Mensagem salva no histórico de conversas");
    }
}