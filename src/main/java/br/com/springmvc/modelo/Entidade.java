package br.com.springmvc.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entidade")
public class Entidade {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String atributo;
	
	public Entidade(String atributo) {
		this.atributo = atributo;
	}
	
	public Entidade(Integer id, String atributo) {
		this.id = id;
		this.atributo = atributo;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}

}
