package br.com.leo.dao;

import java.util.List;

import javax.ejb.Stateless;

import br.com.leo.entity.ItemPedido;
import br.com.leo.entity.Pedido;
import br.com.leo.util.BancoDadosUtil;

@Stateless(name="ejb/ItemPedidoDAO", mappedName="ItemPedidoDAOImpl")
public class ItemPedidoDAOImpl implements ItemPedidoDAO {

	@Override
	public List<ItemPedido> findByPedido(Pedido pedido) throws Exception {
		
		for (Pedido _pedido: BancoDadosUtil.getInstance().getListaPedido() ) {
			if( _pedido.getIdPedido() == pedido.getIdPedido() ){
				return _pedido.getItens();
			}
		}
		
		return null;
	}

	@Override
	public void saveOrUpdate(ItemPedido itemPedido) throws Exception {

		System.out.println(" Save não implementado!!!!");

	}

}
