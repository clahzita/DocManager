package br.com.docmanager.main;

import br.com.docmanager.control.ProcessoController;
import br.com.docmanager.model.Processo;
import br.com.docmanager.view.ProcessoView;

public class DocManagerBancoMain {

	public static void main(String[] args) {
		Processo model = new Processo("123", null, null, null, null);
		ProcessoView view = new ProcessoView();
		
		ProcessoController controller = new ProcessoController(model, view);
		controller.setProcessoInteressado("maria");

		
		Processo model1 = new Processo("456", null, null, null, null);
		ProcessoView view1 = new ProcessoView();
		
		ProcessoController controller1 = new ProcessoController(model1, view1);
		controller1.setProcessoInteressado("jose");
		
	
		controller.inserirBanco();
		controller1.inserirBanco();
		
		controller.listarProcesso();
		
		controller.removerBanco();
		
		controller.listarProcesso();
		
		

	}

}
