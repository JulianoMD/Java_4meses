package lista_ligada;

public class ListaLigada<TIPO> {
    private Node<TIPO> primeiro;
    private Node<TIPO> ultimo;
    private int tamanho;

    public ListaLigada() {
        setTamanho(0);
    }

    public Node<TIPO> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Node<TIPO> primeiro) {
        this.primeiro = primeiro;
    }

    public Node<TIPO> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Node<TIPO> ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(TIPO novoValor){
        Node<TIPO> novoNode = new Node<TIPO>(novoValor);
        if(getPrimeiro() == null &&  getUltimo() == null){
            setPrimeiro(novoNode);
            setUltimo(novoNode);
            setTamanho(getTamanho() + 1);
            return;
        }
        getUltimo().setProximo(novoNode);
        setUltimo(novoNode);
        setTamanho(getTamanho() + 1);
    }

    public void adicionarComeco(TIPO novoValor){
        Node<TIPO> novoNode = new Node<TIPO>(novoValor);
        if(getPrimeiro() == null &&  getUltimo() == null){
            setPrimeiro(novoNode);
            setUltimo(novoNode);
            setTamanho(getTamanho() + 1);
            return;
        }
        novoNode.setProximo(getPrimeiro());
        setPrimeiro(novoNode);
        setTamanho(getTamanho() + 1);
    }

    public void remover(TIPO valorProcurado){

        Node<TIPO> atual = getPrimeiro();

        if (atual == null) return;

        if (atual.getValor().equals(valorProcurado)){
            if (getTamanho() == 1){
                setPrimeiro(null);
                setUltimo(null);
                setTamanho(getTamanho() - 1);
                return;
            }
            setPrimeiro(atual.getProximo());
            setTamanho(getTamanho() - 1);
            return;
        }

        while (atual.getProximo() != null) {
            if (atual.getProximo().getValor().equals(valorProcurado)){
                if (atual.getProximo() == getUltimo()) {
                    setUltimo(atual);
                    atual.setProximo(null);
                }else{
                    atual.setProximo(atual.getProximo().getProximo());
                }
                setTamanho(getTamanho() - 1);
                return;
            }
            atual = atual.getProximo();
        }
    }

    public Node<TIPO> get(int posicao){
        Node<TIPO> atual = getPrimeiro();
        for (int i = 0; i < posicao; i++){
            if(atual != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public IteratorListaLigada<TIPO> getIterator(){
        return new IteratorListaLigada<TIPO>(getPrimeiro());
    }


}