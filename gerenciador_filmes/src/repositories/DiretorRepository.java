package repositories;

import entities.Diretor;

import java.util.HashSet;

public class DiretorRepository {

    private HashSet<Diretor> diretores;

    public DiretorRepository() {
        this.diretores = new HashSet<Diretor>();
    }

    public boolean addDiretor(Diretor diretor) {
		return this.diretores.add(diretor);
	}

	public HashSet<Diretor> getDiretores(){
		return new HashSet<Diretor>(diretores);
	}

	public Diretor getDiretor(String nome) {
		for (Diretor diretor : diretores) { // percorre por cada diretor
            if (diretor.getNome().equalsIgnoreCase(nome)) {
                return new Diretor(diretor); // retorna uma xerox
            }
        }
		return null;
	}
}
