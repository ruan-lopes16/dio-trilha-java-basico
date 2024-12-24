package veiculos;

// classe que vai utilizar um carro e uma moto
public class Garagem {
    public static void main(String[] args) {
        Carro a45 = new Carro();
        a45.setChassis("90387E982370");
        // a45.ligar(); // ligando carro -> fazendo conferencia de cambio e combustivel

        Moto s1000rr = new Moto();
        s1000rr.setChassis("9083042ER39");
        // s1000rr.ligar();

        Veiculo saga = a45;
        saga.ligar();

        Veiculo euroville = s1000rr;
        euroville.ligar();

    }
}
