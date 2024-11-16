public class Usuario {

    public static void main (String [] args) throws Exception { //main pois executa

        SmartTv smartTv = new SmartTv(); // cria-se uma classe SmartTv()

        // status atual da SmartTv
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Novo status:\n");

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        // baixando volume da SmartTv
        smartTv.baixarVolume(); // 24
        smartTv.baixarVolume(); // 23
        smartTv.baixarVolume(); // 22

        // aumentando volume da SmartTv
        smartTv.aumentarVolume();
        System.out.println("^");
        System.out.println(smartTv.volume); // 23

        // alterando canal
        smartTv.mudarCanal(13); // usuario coloca o canal
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal(); // canal alterado conforme "Botao"
        System.out.println("^");
        System.out.println("Canal atual: " + smartTv.canal);

        // desligando...
        smartTv.desligar();
        System.out.println("TV Desligada");

    }
}