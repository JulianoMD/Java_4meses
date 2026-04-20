package entities;

import java.util.Objects;

public class Ator {

    private String nome;

    public Ator(String nome) {
        this.nome = nome;
    }

    public Ator(Ator ator) {
        this.nome = ator.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
	public int hashCode() { // gera código hash para o objeto Ator com base no nome do ator
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // mesma memoria?
			return true;
		if (obj == null || getClass() != obj.getClass()) // nulo ou classe diferente?
			return false;
		Ator other = (Ator) obj; // casting para comparar os nomes dos atores
		return Objects.equals(nome, other.nome); // compara os nomes dos atores
	}

	@Override
	public String toString() {
		return "Ator: " + nome + "\n";
	}
}
