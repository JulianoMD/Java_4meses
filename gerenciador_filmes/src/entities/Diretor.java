package entities;

import java.util.Objects;

public class Diretor {

    private String nome;

    public Diretor(String nome) {
        this.nome = nome;
    }

    public Diretor(Diretor diretor) {
        this.nome = diretor.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { this.nome = nome;}

    @Override
	public int hashCode() { // gera código hash para o objeto Diretor com base no nome do diretor
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // mesma memoria?
			return true;
		if (obj == null || getClass() != obj.getClass()) // nulo ou classe diferente?
			return false;
		Diretor other = (Diretor) obj; // casting para comparar os nomes dos diretores
		return Objects.equals(nome, other.nome); // compara os nomes dos diretores
	}

	@Override
	public String toString() {
		return "Diretor: " + nome + "\n";
	}
}