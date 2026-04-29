package grafos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Grafo <TIPO>{
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;

    public Grafo() {
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
    }

    public void adicionarVertice(TIPO dado) {
        Vertice<TIPO> novoVertice = new Vertice<>(dado);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(Double peso, TIPO dadoInicio, TIPO dadoFim) {
        Vertice<TIPO> inicio = this.getVertice(dadoInicio);
        Vertice<TIPO> fim = this.getVertice(dadoFim);
        Aresta<TIPO> aresta = new Aresta<>(peso, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }

    public Vertice<TIPO> getVertice(TIPO dado) {
        for (Vertice<TIPO> v : vertices) {
            if (v.getDado().equals(dado)) {
                return v;
            }
        }
        return null;
    }

    public void buscaEmLargura() {
    ArrayList<Vertice<TIPO>> marcados = new ArrayList<>();

    for (Vertice<TIPO> verticeInicial : this.vertices) {
        if (!marcados.contains(verticeInicial)) {
            Queue<Vertice<TIPO>> fila = new LinkedList<>();

            marcados.add(verticeInicial);
            System.out.println(verticeInicial.getDado());
            fila.add(verticeInicial);

            while (!fila.isEmpty()) {
                Vertice<TIPO> visitado = fila.poll(); // poll() pega o primeiro e já remove da fila

                for (Aresta<TIPO> aresta : visitado.getArestasSaida()) {
                    Vertice<TIPO> proximo = aresta.getFim();

                    if (!marcados.contains(proximo)) {
                        marcados.add(proximo);
                        System.out.println(proximo.getDado());
                        fila.add(proximo);
                    }
                }
            }
        }
    }
}
}
