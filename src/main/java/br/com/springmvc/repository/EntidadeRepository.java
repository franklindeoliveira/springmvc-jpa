package br.com.springmvc.repository;

import br.com.springmvc.modelo.Entidade;

public interface EntidadeRepository {

	public abstract void create();

	public abstract Entidade read(Integer id);

	public abstract void update();

	public abstract void delete();

}