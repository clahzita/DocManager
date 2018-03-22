/**
 * 
 */
package br.com.docmanager.model;

import java.time.LocalDateTime;

/**
 * @author lets
 *
 */
public class Processo {
	private String numero;
	private Interessado interessado;
	private String nomeInteressado;
	private String assunto;
	private Setor unidadeOrigem;
	private LocalDateTime dataEntrada; //Hora registro do processo no banco
	
	private Situacao situacaoAtual;
	
	private String observacao;
	
	private Setor unidadeDestino; //para onde o processo é dirigido quando concluido	
	private LocalDateTime dataSaida; //Hora que altera e grava situação para concluido
	
	/**
	 * @param numero
	 * @param interessado
	 * @param assunto
	 * @param unidadeOrigem
	 */
	public Processo(String numero, Interessado interessado, String assunto, Setor unidadeOrigem) {
		super();
		this.numero = numero;
		this.interessado = interessado;
		this.assunto = assunto;
		this.unidadeOrigem = unidadeOrigem;
	}
	
	public Processo() {
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNomeInteressado() {
		return nomeInteressado;
	}

	public void setNomeInteressado(String nomeInteressado) {
		this.nomeInteressado = nomeInteressado;
	}

	public Interessado getInteressado() {
		return interessado;
	}

	public void setInteressado(Interessado interessado) {
		this.interessado = interessado;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Setor getUnidadeOrigem() {
		return unidadeOrigem;
	}

	public void setUnidadeOrigem(Setor unidadeOrigem) {
		this.unidadeOrigem = unidadeOrigem;
	}

	public LocalDateTime getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDateTime dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Situacao getSituacaoAtual() {
		return situacaoAtual;
	}

	public void setSituacaoAtual(Situacao situacaoAtual) {
		this.situacaoAtual = situacaoAtual;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Setor getUnidadeDestino() {
		return unidadeDestino;
	}

	public void setUnidadeDestino(Setor unidadeDestino) {
		this.unidadeDestino = unidadeDestino;
	}

	public LocalDateTime getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDateTime dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	
	
	
	
	
	
}
