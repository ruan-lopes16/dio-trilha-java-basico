package msnMessenger;

import msnMessenger.apps.FacebookMessenger;
import msnMessenger.apps.MSNMessenger;
import msnMessenger.apps.ServicoMsgInstantanea;
import msnMessenger.apps.Telegram;

// simulação classe de uso
public class ComputadorFulano {
    public static void main(String[] args) {
        // Com Polimorfismo
        ServicoMsgInstantanea smi = null; // não se sabe qual app, mas deverá enviar e receber mensagem

        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();

        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();

        } else {
            smi = new Telegram();

        }

        smi.enviarMensagem();
        smi.receberMensagem();

        /* ANTES
        // abrindo MSN
        MSNMessenger msn = new MSNMessenger();
        System.out.println("\nMSN");

        // Fulano não precisa mais validar
        // msn.validarConectadoInternet();
        msn.enviarMensagem();

        // Fulano não precisa mais salvar no historico
        // msn.salvarHistoricoMensagem();
        msn.receberMensagem();

        // Abrindo Facebook
        FacebookMessenger fcb = new FacebookMessenger();

        System.out.println("\nFACEBOOK");
        fcb.enviarMensagem();
        fcb.receberMensagem();

        // Abrindo Telegram
        Telegram tlg = new Telegram();

        System.out.println("\nTELEGRAM");
        tlg.enviarMensagem();
        tlg.receberMensagem();
        */
    }
}