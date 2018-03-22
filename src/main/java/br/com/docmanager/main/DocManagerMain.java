package br.com.docmanager.main;
/**
 * 
 */


import br.com.docmanager.control.ProcessoController;
import br.com.docmanager.model.Processo;
import br.com.docmanager.view.ProcessoView;

/**
 * @author clah
 *
 */
public class DocManagerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			//
			Processo model = retriveProcessoFromDataBase();
			
			ProcessoView view = new ProcessoView();
			
			ProcessoController controller = new ProcessoController(model, view);
			
			controller.updateView();
			
			controller.setProcessoInteressado("Maria Francisca da Silva");
			controller.updateView();
			
	}
		
	public static Processo retriveProcessoFromDataBase() {
		Processo processo = new Processo();
		processo.setNumero("23037.025666/2018-89");
		processo.setNomeInteressado("Maria da Silva");
		return processo;
	}

}


