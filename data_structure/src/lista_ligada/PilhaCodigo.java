package lista_ligada;

public class PilhaCodigo {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.adicionar("E");
        pilha.adicionar("B");
        pilha.adicionar("Z");
        pilha.adicionar("D");
        pilha.adicionar("C");

        System.out.println("Topo: " + pilha.get());

        pilha.remover();
        System.out.println("Topo: " + pilha.get());

        pilha.remover();
        System.out.println("Topo: " + pilha.get());
    }
}
