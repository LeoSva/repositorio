package br.com.leo.business;

import javax.ejb.Stateless;

import br.com.leo.entity.Item;
import br.com.leo.entity.ItemPedido;
import br.com.leo.entity.Pedido;

@Stateless( name="ejb/ItemPedido", mappedName="ItemPedidoEJBImpl" )
public class ItemPedidoEJBImpl implements ItemPedidoEJB {

	@Override
	public ItemPedido findByPedido(Pedido pedido) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemPedido findByItem(Item item) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(ItemPedido itemPedido) throws Exception {
		// TODO Auto-generated method stub

	}

}
