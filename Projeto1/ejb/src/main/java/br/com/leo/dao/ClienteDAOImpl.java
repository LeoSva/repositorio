package br.com.leo.dao;

import javax.ejb.Stateless;

import br.com.leo.entity.Cliente;
import br.com.leo.util.BancoDadosUtil;

@Stateless(name="ejb/ClienteDAO", mappedName="ClienteDAOImpl")
public class ClienteDAOImpl implements ClienteDAO{
	
	@Override
	public Cliente findById(int idCliente) throws Exception {
		for ( Cliente cliente : BancoDadosUtil.getInstance().getListaCliente() ) {
			if( cliente.getIdCliente() == idCliente ){
				return cliente;
			}
		}
		
		return null;
	}

	@Override
	public void saveOrUpdate( Cliente cliente ) throws Exception {
		
		if( cliente.getIdCliente() > 0 ){
			BancoDadosUtil.getInstance().getListaCliente().remove( cliente );
		}
		
		BancoDadosUtil.getInstance().getListaCliente().add( cliente );
		
	}

}
