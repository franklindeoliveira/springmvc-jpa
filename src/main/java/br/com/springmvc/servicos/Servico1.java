package br.com.springmvc.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.springmvc.repository.EntidadeRepository;

@Service
public class Servico1 {
	
	/**
	 * Ponto de injeção dos repositórios a serem utilizados.
	 *  Utilizando o Qualifier para especificar a implementação do repositório a ser utilizado.
	 *  Implementações atualmente disponíveis:
	 *  entidadeHsqlRepository, entidadeHsqlJpaRepository, 
	 *  entidadeMysqlRepository, entidadeMysqlJpaRepository, 
	 *  entidadePostgresRepository, entidadePostgresJpaRepository e
	 *  entidadeMockRepository.
	 */
	@Autowired
	@Qualifier("entidadePostgresJpaRepository")
	private EntidadeRepository entidadeRepository;

	public void testeCrud() {
		System.out.println("INI - Acessando servico...");
		entidadeRepository.create();
//		entidadeRepository.read(1);
//		entidadeRepository.update();
//		entidadeRepository.delete();
		System.out.println("FIM - Acessando servico.");
	}
}