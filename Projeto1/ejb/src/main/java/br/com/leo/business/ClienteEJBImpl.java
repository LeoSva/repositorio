package br.com.leo.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.leo.dao.ClienteDAO;
import br.com.leo.entity.Cliente;

@Stateless(name="ejb/Cliente", mappedName="ClienteEJBImpl")
public class ClienteEJBImpl implements ClienteEJB {

	@EJB
	private ClienteDAO clienteDAO;
	
	@Override
	public Cliente findById(int idCliente) throws Exception {
		
		try{
			return clienteDAO.findById( idCliente );
		}
		catch( Exception e ){
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void saveOrUpdate(Cliente cliente) throws Exception {
		
		try{
			clienteDAO.saveOrUpdate( cliente );
		}
		catch( Exception e ){
			e.printStackTrace();
		}

	}

}
