package veiculos;

// "herda" comportamentos do veiculo
public class Moto extends Veiculo {
    @Override
    public void ligar(){
        System.out.println("veiculos.Moto ligada!");
    }

}
