package br.com.leo.business;

import javax.ejb.Stateless;

import br.com.leo.entity.Pedido;

@Stateless(name="ejb/Pedido", mappedName="PedidoEJBImpl")
public class PedidoEJBImpl implements PedidoEJB {

	@Override
	public Pedido findById(int idPedido) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Pedido pedido) throws Exception {
		// TODO Auto-generated method stub

	}

}
