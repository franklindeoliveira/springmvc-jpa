package br.com.springmvc.repository.jpa.postgres;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.springmvc.modelo.Entidade;
import br.com.springmvc.repository.EntidadeRepository;

@Transactional("transactionManagerPostgres")
@Repository
public class EntidadePostgresJpaRepository implements EntidadeRepository {

	@PersistenceContext(unitName = "PUPostgres")
    private EntityManager entityManager;

	@Override
	public void create() {
		System.out.println("CREATE: EntidadePostgresJpaRepository");
		entityManager.persist(new Entidade("coluna"));
	}

	@Override
	public Entidade read(Integer id) {
		System.out.println("READ: EntidadePostgresJpaRepository");
		return entityManager.find(Entidade.class, id);
	}

	@Override
	public void update() {
		System.out.println("UPDATE: EntidadePostgresJpaRepository");
		entityManager.merge(new Entidade(1, "coluna"));
	}

	@Override
	public void delete() {
		System.out.println("DELETE: EntidadePostgresJpaRepository");
		entityManager.remove(read(1));
	}

}
