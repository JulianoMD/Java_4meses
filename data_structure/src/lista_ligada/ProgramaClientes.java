package lista_ligada;

public class ProgramaClientes {
    public static void main(String[] args) {
        ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();
        clientes.adicionar(new Cliente("Pedro", "123456789"));
        clientes.adicionar(new Cliente("Maria", "234567890"));
        clientes.adicionar(new Cliente("Pedro", "345678901"));

        System.out.println("Tamanho: " + clientes.getTamanho());
        for(int i = 0; i < clientes.getTamanho(); i++){
            System.out.println(clientes.get(i).getValor());
        }
    }
}
