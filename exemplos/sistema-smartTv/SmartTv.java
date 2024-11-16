public class SmartTv {
    // atributos ao ligar tv
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // metodo ligar
    public void ligar(){
        ligada = true;
    }
    // metodo desligar
    public void desligar(){
        ligada = false;
    }

    // metodo aumentar volume
    public void aumentarVolume(){
        volume++;
        System.out.println("volume: " + volume);
    }

    // metodo dimunuir volume
    public void baixarVolume(){
        volume--;
        System.out.println("volume: " + volume);
    }

    // metodos de mudar de canal
    public void mudarCanal (int novoCanal){ // usuario coloca o canal - uso de parametro
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
}