// instanciando
public class Objeto {

    public static void main(String[] args) {
        Caneta caneta1 = new Caneta(); // coloca a classe antes do nome do objeto

        // atributos
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.tampada = false;

        // metodo
        caneta1.tampar(); // está tampada
        caneta1.status();
        caneta1.rabiscar(); // quero rabiscar

        //

        Caneta caneta2 = new Caneta();
        //atributos da segunda caneta
        caneta2.modelo = "BIC";
        caneta2.cor = "Preta";

        // metdodos
        caneta2.destampar();
        caneta1.status();
        caneta2.rabiscar();

    }
}