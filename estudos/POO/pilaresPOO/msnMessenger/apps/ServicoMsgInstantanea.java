package msnMessenger.apps;

public abstract class ServicoMsgInstantanea {
    // metodos abstratos, quem for usar("filhos") deve implementar
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    public abstract void salvarHistoricoMsg(); // mais um metodos que todos os filhos deverão implementar

    // somente os filhos conhecem este método
    protected void validarConectadoInternet(){
        System.out.println("Validadando se está conectado à internet");
    }


    /*ANTES - sem determinar que a classe é abstract
        public void enviarMensagem(){

        // toda vez que for enviar uma mensagem ele ja valida se esta conectado
        validarConectadoInternet();

        System.out.println("Enviando mensagem");

        // apos enviar msg, salva no historico
        salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }

    // metodos privados, visiveis somente na classe
    private void validarConectadoInternet(){
        System.out.println("Valindando se está conectado à internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico de mensagem");
    }*/

}