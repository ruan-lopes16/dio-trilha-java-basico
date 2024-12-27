package ferramentas.navegador;

public class Safari implements NavegadorInternet {

    public void exibirPagina(String url) {
        System.out.println("Safari\nPágina: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba ao navegador Safari");
    }

    public void atualizarPagina() {
        System.out.println("*Safari - F5*\nPágina atualizada");
    }
}
