package lista_ligada;

public class Fila {
    private ListaLigada<String> lista;

    public Fila(){
        this.lista = new ListaLigada<String>();
    }

    public void adicionar(String novoValor){
        this.lista.adicionar(novoValor);
    }
    public void remover(String novoValor){
        this.lista.remover(this.get());
    }
     public String get(){
     return this.lista.getPrimeiro().getValor();
    }

}
