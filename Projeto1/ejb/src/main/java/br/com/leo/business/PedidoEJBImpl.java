package br.com.leo.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.leo.dao.PedidoDAO;
import br.com.leo.entity.Pedido;

@Stateless(name="ejb/Pedido", mappedName="PedidoEJBImpl")
public class PedidoEJBImpl implements PedidoEJB {

	@EJB
	private PedidoDAO pedidoDAO;

	@Override
	public Pedido findById(int idPedido) throws Exception {

		try{
			return pedidoDAO.findById(idPedido);
		}
		catch(Exception e){
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void saveOrUpdate(Pedido pedido) throws Exception {

		try{
			pedidoDAO.saveOrUpdate(pedido);
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
