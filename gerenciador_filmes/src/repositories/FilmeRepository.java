package repositories;

import entities.Filme;

import java.util.HashSet;

public class FilmeRepository {

    private HashSet<Filme> filmes;

    public FilmeRepository() {
        this.filmes = new HashSet<Filme>();
    }

    public boolean addFilme(Filme filme) {
		return this.filmes.add(filme);
	}

	public HashSet<Filme> getFilmes(){
		return new HashSet<Filme>(this.filmes);
	}

}
