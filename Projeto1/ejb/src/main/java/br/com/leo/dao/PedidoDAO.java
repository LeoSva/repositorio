package br.com.leo.dao;

import javax.ejb.Local;

import br.com.leo.entity.Pedido;

@Local
public interface PedidoDAO {

	public Pedido findById( int idPedido ) throws Exception;

	public void saveOrUpdate( Pedido pedido ) throws Exception;
}
