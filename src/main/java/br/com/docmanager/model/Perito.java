/**
 * 
 */
package br.com.docmanager.model;

/**
 * @author clah
 *
 */
public class Perito extends Pessoa {
	private String tipoConselho; //Ver como só vincular CRO e CRM
	private String ufRegistro;
	private int numeroConselho;
	
	
	public Perito(String nome, String cpf, String tipoConselho, int numeroConselho) {
		super(nome, cpf);
		this.tipoConselho = tipoConselho;
		this.numeroConselho = numeroConselho;
	}


	public String getTipoConselho() {
		return tipoConselho;
	}


	public void setTipoConselho(String tipoConselho) {
		this.tipoConselho = tipoConselho;
	}


	public String getUfRegistro() {
		return ufRegistro;
	}


	public void setUfRegistro(String ufRegistro) {
		this.ufRegistro = ufRegistro;
	}


	public int getNumeroConselho() {
		return numeroConselho;
	}


	public void setNumeroConselho(int numeroConselho) {
		this.numeroConselho = numeroConselho;
	}
	
	
	
	
	
	

}
