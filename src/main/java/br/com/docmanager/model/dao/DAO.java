/**
 * 
 */
package br.com.docmanager.model.dao;

import java.util.List;

/**
 * @author clah
 *
 */
public interface DAO<T> {
	
	public void salvar(T bean);
	public void atualizar(T bean);
	public void deletar(T id);
	public Object getById(T id);
	public List<T> getAll();

}
