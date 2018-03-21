/**
 * 
 */
package br.com.docmanager.model.dao;

import java.util.HashMap;

import br.com.docmanager.model.Pessoa;
import br.com.docmanager.model.Processo;

/**
 * Classe representa persistencia de dados
 * @author lets
 *
 */
public final class ProcessoDao {
	private static final HashMap<String, Processo> banco = new HashMap<String, Processo>();
	
	
	public void inserir(Processo processo) {
		banco.put(processo.getNumero(), processo);
		
	}
	
	public void remover(Processo processo) {
		banco.remove(processo.getNumero());
		
	}
	
	public void atualizar(Processo processo) {
		//fazer logica da atualização
	}
	
	public Processo buscarPorChave(String numeroProcesso) {
		
		return banco.get(numeroProcesso);
	}
	
	public boolean existeAlgum(String key) {
		return banco.containsKey(key);
	}
	
	
}
