package iPhone;

public class AparelhoTelefonico {
    private String operadora;
    private String numero;

    public void ligar(String numero) {
        System.out.printf("O NUMERO %s ESTA SENDO CHAMADO", numero);
    }

    public void atender() {
        System.out.println("LIGACAO ATENDIDA");
    }

    public void iniciarCorreioVoz() {
        System.out.println("DEIXE UMA MENSAGEM APOS O SINAL");
    }
}
