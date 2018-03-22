/**
 * 
 */
package br.com.docmanager.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.docmanager.model.Pessoa;
import br.com.docmanager.model.Processo;

/**
 * Classe representa persistencia de dados
 * @author lets
 *
 */
public final class ProcessoDao implements DAO {
	private static final HashMap<String, Processo> banco = new HashMap<String, Processo>();
	
	
	public Processo buscarPorChave(String numeroProcesso) {
		
		return banco.get(numeroProcesso);
	}
	
	public boolean existeAlgum(String key) {
		return banco.containsKey(key);
	}

	public void salvar(Object bean) {
		Processo processo = (Processo) bean;
		banco.put(processo.getNumero(), processo);
		
		
	}

	public void atualizar(Object bean) {
		// TODO Auto-generated method stub
		
	}

	public void deletar(Object id) {
		String numeroProcesso = (String)id;
		banco.remove(numeroProcesso);
		
	}

	public Object getById(Object id) {
		String numeroProcesso = (String)id;
		return banco.get(numeroProcesso);
	}

	public List<Processo> getAll() {
		List<Processo> listaProcessos =  new ArrayList<Processo>(banco.values());
		for (Processo processo : listaProcessos) {
		    System.out.println(processo.getNumero());
		}
			
		return listaProcessos;
	}
	
}
