package veiculos;

// classe abstrata, pois não sei como as coisas de fato acontecem - mas todos veiculos precisará...
public abstract class Veiculo {

    private String chassis;
    public String getChassis(){
        return chassis;
    }
    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public abstract void ligar(); // ligando veículo


}
