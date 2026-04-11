package ordenamento;

public class QuickSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }

        System.out.println("Vetor desordenado");
        for (int i : vetor) {
            System.out.print(i + " ");
        }

        quickSort(vetor, 0, vetor.length - 1);

        System.out.println("\nVetor ordenado");
        for (int i : vetor) {
            System.out.print(i + " ");
        }

    }

    static void quickSort(int[] vetor, int esquerda, int direita) {
        if  (esquerda < direita) {
            int pivo = particao(vetor, esquerda, direita);
            quickSort(vetor, esquerda, pivo);
            quickSort(vetor, pivo + 1, direita);
        }
    }
    static int particao(int[] vetor, int esquerda, int direita) {
        int meio = (esquerda + direita) / 2;
        int pivo =  vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while (true){
            do{
                i++;
            }while (vetor[i] < pivo);
            do{
                j--;
            }while (vetor[j] > pivo);
            if (i >= j) {
                return j;
            }
            int aux = vetor[j];
            vetor[j] = vetor[i];
            vetor[i] = aux;
        }
    }
}
