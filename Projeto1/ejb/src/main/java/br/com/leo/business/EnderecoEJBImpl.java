package br.com.leo.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.leo.dao.EnderecoDAO;
import br.com.leo.entity.Endereco;

/**
 * @author Leonaldo
 * 
 * Exemplo lookup portável
 * EnderecoEJB enderecoEJB = (EnderecoEJB) new InitialContext().lookup("java:app/web/ejb/Endereco");
 * Exemplo lookup direto
 * EnderecoEJB enderecoEJB = (EnderecoEJB) new InitialContext().lookup("java:global/ear/web/ejb/Endereco!br.com.leo.business.EnderecoEJB");
 *
 */
@Stateless(name="ejb/Endereco", mappedName="EnderecoEJBImpl")
public class EnderecoEJBImpl implements EnderecoEJB{
	
	@EJB
	private EnderecoDAO enderecoDAO;
	
	@Override
	public Endereco findById( int idEndereco ) throws Exception{
		
		try{
			return enderecoDAO.findById( idEndereco );
		}
		catch( Exception e ){
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	@Override
	public void saveOrUpdate( Endereco endereco ) throws Exception {
		
		try{
			enderecoDAO.saveOrUpdate( endereco );
		}
		catch( Exception e ){
			e.printStackTrace();
		}
		
	}
	
}
