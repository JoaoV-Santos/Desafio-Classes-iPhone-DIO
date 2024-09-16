package iPhone;

public class NavegadorInternet {
    private String buscador;
    private int versao;

    public void exibirPagina(String url) {
        System.out.printf("A PAGINA DA URL %s ESTA SENDO EXIBIDA", url);
    }

    public void adicionarNovaAba() {
        System.out.println("UMA NOVA ABA FOI ADICIONADA");
    }

    public void atualizarPagina() {
        System.out.println("A PAGINA FOI RECARREGADA");
    }
}
