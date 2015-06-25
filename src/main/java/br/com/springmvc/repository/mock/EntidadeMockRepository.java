package br.com.springmvc.repository.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.springmvc.modelo.Entidade;
import br.com.springmvc.repository.EntidadeRepository;

@Repository
public class EntidadeMockRepository implements EntidadeRepository {

	private static List<Entidade> entidades;

	/**
	 * Construtor que inicializa o mock.
	 */
	public EntidadeMockRepository() {
		entidades = new ArrayList<Entidade>();
		entidades.add(new Entidade(0, "Entidade 1"));
		entidades.add(new Entidade(1, "Entidade 2"));
		entidades.add(new Entidade(2, "Entidade 3"));
		System.out.println("Mock carregado com sucesso.");
	}

	@Override
	public void create() {
		entidades.add(new Entidade(1, "Entidade 1 adicionada"));
	}

	@Override
	public Entidade read(Integer id) {
		return entidades.get(id);
	}

	@Override
	public void update() {
		entidades.set(0, new Entidade(0, "Entidade 1 alterada"));
	}

	@Override
	public void delete() {
		entidades.remove(0);
	}

}
