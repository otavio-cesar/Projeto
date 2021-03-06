package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "Caso_De_Teste")
public class CasoDeTeste{

	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	@JoinColumn(nullable = true)
	private Problema problema;

	@NotNull
	@ManyToOne
	@JoinColumn(nullable = false)
	private Usuario creator;

	@NotBlank
	private String entrada;

	@NotBlank
	private String saida;

	@Column(length = 255)
	private String descricao;

	@NotBlank
	@Column(length = 100)
	private String nome;

	private boolean isPadrao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Problema getProblema() {
		return problema;
	}

	public void setProblema(Problema problema) {
		this.problema = problema;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario getCreator() {
		return creator;
	}

	public void setCreator(Usuario creator) {
		this.creator = creator;
	}

	public boolean isPadrao() {
		return isPadrao;
	}

	public void setPadrao(boolean isPadrao) {
		this.isPadrao = isPadrao;
	}
	
}
