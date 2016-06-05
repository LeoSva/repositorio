package br.com.leo.business;

import javax.ejb.Local;

import br.com.leo.entity.Item;
import br.com.leo.entity.ItemPedido;
import br.com.leo.entity.Pedido;

@Local
public interface ItemPedidoEJB {

	public ItemPedido findByPedido( Pedido pedido ) throws Exception;
	
	public ItemPedido findByItem( Item item ) throws Exception;
	
	public void saveOrUpdate( ItemPedido itemPedido ) throws Exception;
	
}
