package temas.pilhas;

public class Main {
    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha(); // instanciando/criando pilha
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));

        System.out.println(minhaPilha);

        System.out.println("popped: " + minhaPilha.pop()); // retirando o ultimo elemento
        System.out.println(minhaPilha);

        minhaPilha.push(new No(99)); // adicionando 99 na pilha, ela passa a ter a ref de 6
        System.out.println(minhaPilha);


    }
}
