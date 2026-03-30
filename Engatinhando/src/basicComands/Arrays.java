package src.basicComands;

public class Arrays {
    public static void main(String[] args) {

        String[] nomes = new String[]{
                "Joao", "Maria", "Goku", "Piccolo", "Vegeta"
        };

        int[] numeros = new int[100];


        for (String nome : nomes) { // ler dados
            System.out.println(nome);
        }

        for (int i = 0; i < numeros.length; i++) { // prencher com dados
            numeros[i] = i;
            System.out.println(numeros[i]);
        }
    }
}
