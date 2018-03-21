/**
 * 
 */
package br.com.docmanager.model;

import java.time.LocalDateTime;

/**
 * Classe representa em que situação o processo se encontra no setor.
 * @author clah
 *
 */
public class Situacao {
	private String descricao;;
	private LocalDateTime dataRegistro;
	
	/**
	 * @param descricao
	 * @param dataRegistro
	 */
	public Situacao(String descricao) {
		this.descricao = descricao;
		this.dataRegistro = LocalDateTime.now();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	
	
}
