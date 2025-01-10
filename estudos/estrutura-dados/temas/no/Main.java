package temas.no;

public class Main {
    public static void main(String[] args) {
        // nós
        No no1 = new No("no 1");
        No no2 = new No("no 2");

        // encadeamento - referencia
        no1.setProximoNo(no2);

        // criando mais um nó
        No no3 = new No("no 3");

        no2.setProximoNo(no3); // encadeamento - referencia

        No no4 = new No("no 4"); // criando mais um nó
        no3.setProximoNo(no4); // encadeamento - referencia

        // no1->no2->no3->no4->null
        System.out.println(no1); // exibe oq tem no no1

        System.out.println(no1.getProximoNo()); // exibe no2

        System.out.println("--------------------------");

        System.out.println(no1); // no1
        System.out.println(no1.getProximoNo()); // no2
        System.out.println(no1.getProximoNo().getProximoNo()); // no3
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo()); // no4
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo()); // null
    }
}
