package lista_ligada;

public class FilaCodigo {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adicionar("Primeiro");
        fila.adicionar("Segundo");
        fila.adicionar("Terceiro");
        fila.adicionar("Quarto");
        fila.adicionar("Quinto");

        System.out.println(fila.get());

    }
}
