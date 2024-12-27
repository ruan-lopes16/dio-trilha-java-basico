package aparelho;

import ferramentas.musica.AppleMusic;
import ferramentas.musica.ReprodutorMusica;
import ferramentas.navegador.NavegadorInternet;
import ferramentas.navegador.Safari;
import ferramentas.telefone.AparelhoTelefonico;
import ferramentas.telefone.Telefone;

public class IPhone {
    public static void main(String[] args) {
        NavegadorInternet navegador = new Safari();
        navegador.exibirPagina("https://study-adventure.patrickmaciel.info/player");
        navegador.atualizarPagina();
        navegador.adicionarNovaAba();

        System.out.println("\n");
        //

        AparelhoTelefonico telefone = new Telefone();
        telefone.ligar("(34) 99111-1111");
        telefone.atender(true);
        telefone.iniciarCorreioVoz();

        System.out.println("\n");
        //

       ReprodutorMusica reprodutor = new AppleMusic();
       reprodutor.selecionarMusica("Sala do Trono (Ao Vivo) - Central 3, fhop music");
       reprodutor.tocar();
       reprodutor.pausar();

    }
}
