package br.com.leo.dao;

import javax.ejb.Stateless;

import br.com.leo.entity.Pedido;
import br.com.leo.util.BancoDadosUtil;

@Stateless(name="ejb/PedidoDAO", mappedName="PedidoDAOImpl")
public class PedidoDAOImpl implements PedidoDAO {

	@Override
	public Pedido findById(int idPedido) throws Exception {
		
		for ( Pedido pedido : BancoDadosUtil.getInstance().getListaPedido() ) {
			if( pedido.getIdPedido() == idPedido ){
				return pedido;
			}
		}
		
		return null;
	}

	@Override
	public void saveOrUpdate(Pedido pedido) throws Exception {
		
		if( pedido.getIdPedido() > 0 ){
			BancoDadosUtil.getInstance().getListaPedido().remove( pedido );
		}

		BancoDadosUtil.getInstance().getListaPedido().add( pedido );
	}

}
