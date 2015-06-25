package br.com.springmvc.repository.jdbc.hsql;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import br.com.springmvc.modelo.Entidade;
import br.com.springmvc.repository.EntidadeRepository;

@Repository
public class EntidadeHsqlRepository implements EntidadeRepository {

	private Connection connection;

	/**
	 * Construtor que cria uma conexão com o banco de dados de acordo com o
	 * <code>id</code> do datasource configurado no spring-contex.xml, que é
	 * passado como parâmetro do <code>@Qualifier</code>.
	 * 
	 * @param ds
	 */
	@Autowired
	public EntidadeHsqlRepository(@Qualifier("hsqlDataSource") DataSource ds) {
		try {
			this.connection = ds.getConnection();
			connection.prepareStatement("CREATE TABLE IF NOT EXISTS tabela (coluna VARCHAR(100));").execute();
			System.out.println("HSQL - Conexão com o banco de dados estabelecida com sucesso.");
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

	@Override
	public void create() {
		try {
			connection.prepareStatement("INSERT INTO tabela VALUES ('coluna')").execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Entidade read(Integer id) {
		try {
			connection.prepareStatement("SELECT * FROM tabela").executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void update() {
		try {
			connection.prepareStatement("UPDATE tabela SET coluna = 'coluna update'").execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete() {
		try {
			connection.prepareStatement("DELETE FROM tabela").execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
