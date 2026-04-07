package lista_ligada;

public class Programa {
    public static void main(String[] args) {

        ListaLigada<String> lista = new ListaLigada<String>();
        System.out.println(lista.getTamanho());
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo: " + lista.getUltimo().getValor());
        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        lista.remover("BA");
        System.out.println("Removeu valor");
        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
    }
}
