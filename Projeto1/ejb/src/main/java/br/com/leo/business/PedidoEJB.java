package br.com.leo.business;

import javax.ejb.Local;

import br.com.leo.entity.Pedido;

@Local
public interface PedidoEJB {

	public Pedido findById( int idPedido ) throws Exception;
	
	public void saveOrUpdate( Pedido pedido ) throws Exception;
	
}
