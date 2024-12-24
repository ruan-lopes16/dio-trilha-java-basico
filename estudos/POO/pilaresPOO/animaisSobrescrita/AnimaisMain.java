package animaisSobrescrita;

public class AnimaisMain {
    public static void main(String[] args) {
        // criando animal
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        // atribuindo valores
        m.setPeso(55.3f);
        System.out.println(m.getPeso() + "kg");
        m.setCorPelo("Marrom");
        System.out.println(m.getCorPelo());

        r.setIdade(11);
        System.out.println(r.getIdade() + " anos");
        r.setCorEscama("verde");
        System.out.println(r.getCorEscama()); // para exibir um setter

        p.setMembros(0);
        System.out.println(p.getMembros());
        p.setPeso(0.35f);
        System.out.println(p.getPeso() + "kg");

        a.setCorPena("amarelo");
        System.out.println(a.getCorPena());

        // metodos
        m.locomover();
        m.alimentar();

        a.locomover();
        a.emitirSom();

        r.locomover();
        r.alimentar();

        p.locomover();
        p.soltarBolha();

        // ex. reais
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Tartaruga tartaruga = new Tartaruga();
        Cobra cobra = new Cobra();
        GoldFish goldFish = new GoldFish();
        Arara arara = new Arara();

        canguru.locomover(); // Saltando
        canguru.emitirSom(); // Som de mamífero

        cachorro.locomover(); // Correndo
        cachorro.emitirSom(); // Latindo... AUAUAU

    }
}