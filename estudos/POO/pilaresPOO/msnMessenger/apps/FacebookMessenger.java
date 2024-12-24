package msnMessenger.apps;

public class FacebookMessenger extends ServicoMsgInstantanea {

    // implementando os metodos abstratos
    @Override
    public void enviarMensagem() {
        validarConectadoInternet(); // antes de enviar msg valida se está conectado
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
        salvarHistoricoMsg();
    }

    @Override
    public void salvarHistoricoMsg() {
        System.out.println("Mensagem salva no histórico de conversas");
    }
}