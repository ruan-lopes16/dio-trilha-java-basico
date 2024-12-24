package animaisSobrescrita;

public class Canguru extends Mamifero {
    // sobrescrevendo metodo
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
}
