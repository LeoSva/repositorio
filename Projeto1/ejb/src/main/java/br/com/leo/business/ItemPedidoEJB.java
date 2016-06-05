package br.com.leo.business;

import java.util.List;

import javax.ejb.Local;

import br.com.leo.entity.ItemPedido;
import br.com.leo.entity.Pedido;

@Local
public interface ItemPedidoEJB {

	public List<ItemPedido> findByPedido( Pedido pedido ) throws Exception;

//	public List<ItemPedido> findByItem( Item item ) throws Exception;

	public void saveOrUpdate( ItemPedido itemPedido ) throws Exception;
	
}
