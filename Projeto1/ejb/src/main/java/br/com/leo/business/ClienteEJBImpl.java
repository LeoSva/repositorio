package br.com.leo.business;

import javax.ejb.Stateless;

import br.com.leo.entity.Cliente;

@Stateless(name="ejb/Cliente", mappedName="ClienteEJBImpl")
public class ClienteEJBImpl implements ClienteEJB {

	@Override
	public Cliente findById(int idCliente) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Cliente cliente) throws Exception {
		// TODO Auto-generated method stub

	}

}
