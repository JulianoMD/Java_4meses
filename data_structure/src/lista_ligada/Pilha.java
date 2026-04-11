package lista_ligada;

public class Pilha {
    private ListaLigada<String> lista;

    public Pilha(){
        this.lista = new ListaLigada<String>();
    }

    public void adicionar(String novoValor){
        this.lista.adicionarComeco(novoValor);
    }

    public void remover(){
        this.lista.remover(this.get());
    }

    public String get(){
        return this.lista.getPrimeiro().getValor();
    }
}
