package br.com.leo.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.leo.dao.ItemPedidoDAO;
import br.com.leo.entity.ItemPedido;
import br.com.leo.entity.Pedido;

@Stateless( name="ejb/ItemPedido", mappedName="ItemPedidoEJBImpl" )
public class ItemPedidoEJBImpl implements ItemPedidoEJB {
	
	@EJB
	private ItemPedidoDAO itemPedidoDAO;

	@Override
	public List<ItemPedido> findByPedido(Pedido pedido) throws Exception {
		
		try{
			return itemPedidoDAO.findByPedido( pedido );
		}
		catch( Exception e ){
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void saveOrUpdate(ItemPedido itemPedido) throws Exception {

		try{
			itemPedidoDAO.saveOrUpdate(itemPedido);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
