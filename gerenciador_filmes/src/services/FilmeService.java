package services;

import java.util.*;

import dto.FilmeDto;
import entities.Ator;
import entities.Diretor;
import entities.Filme;
import repositories.AtorRepository;
import repositories.DiretorRepository;
import repositories.FilmeRepository;

public class FilmeService {

	private FilmeRepository fr;
	private AtorRepository ar;
	private DiretorRepository dr;

	public FilmeService() {
		this.fr = new FilmeRepository();
		this.ar = new AtorRepository();
		this.dr = new DiretorRepository();
	}

	public boolean addFilme(String nome, String diretor, String elenco[], float nota) {

		// Adicione diretor na lista de diretores (DiretorRepository)
		this.addDiretor(diretor);

		HashSet<Ator> atores = new HashSet<Ator>();

		for (String ator : elenco) {
            this.addAtor(ator); // adiciona o ator na lista de atores (AtorRepository)
            atores.add(new Ator(ator)); // adiciona o ator na lista de atores do filme
        }

		Filme filme = new Filme(nome, new Diretor(diretor), atores, nota);

		return fr.addFilme(filme); // adiciona o filme na lista de filmes (FilmeRepository)
	}

	public boolean addFilme(FilmeDto filmeDto) { // "desempacota o filmeDto" e chama o
        // outro método addFilme para realizar os cadastros
		return this.addFilme(filmeDto.getNome(), filmeDto.getDiretor(), filmeDto.getElenco(), filmeDto.getNota());
	}

	public List<FilmeDto> listaFilmesPorNome(){
        // pede todos os filmes do fr e transforma em arraylist para ordenacao
		List<Filme> filmesFiltrados = new ArrayList<Filme>( this.fr.getFilmes() );

        // usa o lambda .sort para ordenar, o1 e o2 pega dois obj filme
        // -> = para esses dois objetos execute esse logica {verificacao de quem vem primeiro alfabeticamente}
		filmesFiltrados.sort((o1, o2) -> { return o1.getNome().compareTo(o2.getNome()); });

		return converteListaFilmeParaDto(filmesFiltrados);
	}

	public List<FilmeDto> listaFilmesPorDiretor(String diretor){
        // cria a lista que vai guardar apenas os filmes que passarem no teste
		ArrayList<Filme> filmesFiltrados = new ArrayList<Filme>();

        // pega todos os filmes do repositorio
		HashSet<Filme> filmes = this.fr.getFilmes();

		for (Filme filme : filmes) {
            if (filme.getDiretor().getNome().equals(diretor)) {
                filmesFiltrados.add(filme);
            }
        }

		return converteListaFilmeParaDto(filmesFiltrados);
	}

	public List<FilmeDto> listaFilmesPorAtor(String listaAtor){
        // cria a lista que vai guardar apenas os filmes que passarem no teste
		ArrayList<Filme> filmesFiltrados = new ArrayList<Filme>();

        // pega todos os filmes do repositorio FilmeRepository
        for (Filme filme : this.fr.getFilmes()) {
            for (Ator ator : filme.getElenco()) {
                if (filme.getElenco().contains(ator) && ator.getNome().equalsIgnoreCase(listaAtor)) {
                    filmesFiltrados.add(filme);
                    break; // achou o autor entao para e vai para o proximo filme
                }
            }
        }
		return converteListaFilmeParaDto(filmesFiltrados);
	}

	public List<FilmeDto> listaFilmesPorNota(float nota){
		ArrayList<Filme> filmesFiltrados = new ArrayList<Filme>();

        // percorre a lista de filmes e para cada filme
		for(Filme filme : this.fr.getFilmes()) {
			if(filme.getNota() >= nota)
				filmesFiltrados.add(filme);
		}

		return converteListaFilmeParaDto(filmesFiltrados);
	}

	private List<FilmeDto> converteListaFilmeParaDto(List<Filme> filmes){
		List<FilmeDto> filmesDto = new ArrayList<FilmeDto>();

        // percorre a lista de filmes e para cada filme, cria um filmeDto e adiciona na lista de filmesDto
		for(Filme filme : filmes) {
			filmesDto.add(new FilmeDto(filme));
		}

		return filmesDto;
	}

	public boolean addAtor(String nome) {
        // cria um obj ator e adiciona na lista de atores (AtorRepository) se o ator nao existir
		return this.ar.addAtor(new Ator(nome));
	}

	public Ator getAtor(String nome) {
        // busca se existe o ator com o nome requerido e retorna null se nao encontrar
		return ar.getAtor(nome);
	}

	public ArrayList<String> listaAtores(){
		ArrayList<String> atores = new ArrayList<>();

        // percorre a lista de atores do AtorRepository e para cada ator, adiciona o nome do ator na lista de atores
		for(Ator ator : this.ar.getAtores()) {
			atores.add(ator.getNome());
        }
        Collections.sort(atores); // ordena alfabeticamente
		return atores;
	}

	public boolean addDiretor(String nome) {
        // cria um obj diretor e adiciona na lista de diretores (DiretorRepository) se o diretor nao existir
		return this.dr.addDiretor(new Diretor(nome));
	}

	public ArrayList<String> listaDiretores(){

		ArrayList<String> diretores = new ArrayList<String>();

		for(Diretor d : this.dr.getDiretores()) {
            diretores.add(d.getNome());
        }
        Collections.sort(diretores);

		return diretores;
	}
}