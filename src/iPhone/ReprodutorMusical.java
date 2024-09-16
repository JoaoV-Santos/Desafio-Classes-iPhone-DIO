package iPhone;

public class ReprodutorMusical {

    public void tocar() {
        System.out.println("A MUSICA ESTA SENDO REPRODUZIDA");
    }

    public void pausar() {
        System.out.println("A MUSICA ESTA PAUSADA");
    }

    public void selecionarMusica(String musica) {
        System.out.printf("A MUSICA %s ESTA SENDO REPRODUZIDA", musica);
    }
}
