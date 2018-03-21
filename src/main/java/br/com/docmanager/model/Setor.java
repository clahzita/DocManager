/**
 * 
 */
package br.com.docmanager.model;

/**
 * @author clah
 *
 */
public class Setor {
	private String nome;
	private String sigla;
	private Orgao orgao;
	
	
	/**
	 * @param nome
	 * @param sigla
	 * @param orgao
	 */
	public Setor(String nome, String sigla, Orgao orgao) {
		this.nome = nome;
		this.sigla = sigla;
		this.orgao = orgao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Orgao getOrgao() {
		return orgao;
	}
	public void setOrgao(Orgao orgao) {
		this.orgao = orgao;
	}
	
	
}
