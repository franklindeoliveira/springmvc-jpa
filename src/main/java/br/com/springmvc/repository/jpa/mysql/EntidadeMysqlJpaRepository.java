package br.com.springmvc.repository.jpa.mysql;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.springmvc.modelo.Entidade;
import br.com.springmvc.repository.EntidadeRepository;

@Transactional("transactionManagerMysql")
@Repository
public class EntidadeMysqlJpaRepository implements EntidadeRepository {

	@PersistenceContext(unitName = "PUMysql")
    private EntityManager entityManager;

	@Override
	public void create() {
		entityManager.persist(new Entidade(1, "coluna"));
	}

	@Override
	public Entidade read(Integer id) {
		return entityManager.find(Entidade.class, id);
	}

	@Override
	public void update() {
		entityManager.merge(new Entidade(1, "coluna"));
	}

	@Override
	public void delete() {
		entityManager.remove(read(1));
	}

}
