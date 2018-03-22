package br.com.docmanager.control;

import java.util.List;

import br.com.docmanager.model.Processo;
import br.com.docmanager.model.dao.ProcessoDao;
import br.com.docmanager.view.ProcessoView;

public class ProcessoController {
	private Processo model;
	private ProcessoView view;
	private ProcessoDao dao;
	
	public ProcessoController(Processo model, ProcessoView view) {
		this.model = model;
		this.view = view;
		this.dao = new ProcessoDao();
	}
	
	public String getProcessoNumero() {
		return model.getNumero();
	}
	
	public void setProcessoNumero(String numero) {
		//regra para atualizar numero
		this.model.setNumero(numero);
	}
	
	public String getProcessoInteressado() {
		return model.getNomeInteressado();
	}
	
	public void setProcessoInteressado(String nome) {
		//regra para atualizar nome
		this.model.setNomeInteressado(nome);
	
	}
	
	public void updateView() {
		view.printStudentDetails(model.getNumero(), model.getNomeInteressado());
	}
	
	public void inserirBanco(){
		
		this.dao.salvar(this.model);
	}
	
	public void removerBanco() {
		
		this.dao.deletar(this.model.getNumero());
		
	}
	
	public void atualizarProcessoBanco(Processo processo) {
		//fazer logica da atualização
	}
	
	public Processo buscarPorChaveProcessoBanco(String numeroProcesso) {
		
		return this.dao.buscarPorChave(this.model.getNumero());
	}
	
	public List<Processo> listarProcesso(){
		List<Processo> lista = this.dao.getAll();
		
		if(lista==null) {
			System.out.println("lista vazia");
			return null;
		}
		return lista;
	}

}
