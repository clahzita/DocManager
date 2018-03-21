/**
 * 
 */
package br.com.docmanager.model;

/**
 * Classe abstrata para atributos e metodos comuns de Interessado e Perito
 * @author clarissa
 *
 */
public abstract class Pessoa {
	private String nome;
	private String cpf;
	private String matricula; //SIAPE ou Aluno e Pensionista não tem matricula
	
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	
	

}
