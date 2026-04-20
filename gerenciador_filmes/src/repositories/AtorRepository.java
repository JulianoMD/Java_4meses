package repositories;

import entities.Ator;

import java.util.HashSet;

public class AtorRepository {

    private HashSet<Ator> atores;

    public AtorRepository() {
        this.atores = new HashSet<Ator>();
    }

    public HashSet<Ator> getAtores() {
        return new HashSet<Ator>(atores);
    }

    public boolean addAtor(Ator ator) {
        return this.atores.add(ator);
    }

	public Ator getAtor(String nome) {
        for (Ator ator : atores) { // percorre cada por cada ator
            if (ator.getNome().equalsIgnoreCase(nome)) {
                return new Ator(ator); // retorna uma xerox
            }
        }
		return null;
	}

}
