package lista_ligada;

public class IteratorListaLigada<TIPO> {
    private Node<TIPO> elemento;

    public IteratorListaLigada(Node<TIPO> atual){
        this.elemento = atual;
    }

    public boolean temProximo(){
        if (elemento.getProximo() == null){
            return false;
        }
        return true;
    }

    public Node<TIPO> getProximo(){
        elemento = elemento.getProximo();
        return elemento;
    }

}