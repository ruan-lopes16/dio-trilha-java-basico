package ferramentas.telefone;

public class Telefone implements AparelhoTelefonico {

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender(boolean estado) {
        if (estado){
            System.out.println("*Atendendo chamada*");
            System.out.println("*Bate-papo*");
        } else {
            System.out.println("Chamada recusada.");
        }
    }

    public void iniciarCorreioVoz() {
        System.out.println("Gravando correio de voz...");
    }
}