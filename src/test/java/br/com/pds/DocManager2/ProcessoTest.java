package br.com.pds.DocManager2;

import br.com.docmanager.model.GerenciadorFacade;
import br.com.docmanager.model.Orgao;
import br.com.docmanager.model.dao.HashProcessoDao;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ProcessoTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ProcessoTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ProcessoTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testcadastrarSucesso()
    {
    	String numeroProcesso = "123";
    	String assuntoProcesso = "isenção";
    	String unidadeOrigem = "UFRN";
    	String situacao = "Analise";
    	String nomeInteressado = "Clara";
    	String cpfInteressado = "05544422233";
    	String contato1 = "99992222";
    	String contato2 = "88889999";
    	GerenciadorFacade.cadastrarNovoProcesso(numeroProcesso, assuntoProcesso, new Orgao(unidadeOrigem), situacao, nomeInteressado, cpfInteressado, contato1, contato2);
    	HashProcessoDao dao = new HashProcessoDao();
    	
        assertTrue(dao.existeAlgum(numeroProcesso));
        
    }
}
