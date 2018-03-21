/**
 * 
 */
package br.com.docmanager.model;

/**
 * Classe representa o interessado do processo, pessoa vinculada ao processo como
 * parte interessada.
 * 
 * @author clah
 *
 */
public class Interessado extends Pessoa {

	private String contato1;
	private String contato2;
	
	public Interessado(String nome, String cpf) {
		super(nome, cpf);
	
	}

	public String getContato1() {
		return contato1;
	}

	public void setContato1(String contato1) {
		this.contato1 = contato1;
	}

	public String getContato2() {
		return contato2;
	}

	public void setContato2(String contato2) {
		this.contato2 = contato2;
	}
	
	

}
