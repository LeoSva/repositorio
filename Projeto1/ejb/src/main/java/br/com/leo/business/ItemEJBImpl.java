package br.com.leo.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.leo.dao.ItemDAO;
import br.com.leo.entity.Item;

@Stateless(name="ejb/Item", mappedName="ItemEJBImpl")
public class ItemEJBImpl implements ItemEJB {
	
	@EJB
	private ItemDAO itemDAO;

	@Override
	public Item findById(int idItem) throws Exception {
		
		try{
			return itemDAO.findById( idItem );
		}
		catch( Exception e ){
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void saveOrUpdate(Item item) throws Exception {

		try{
			itemDAO.saveOrUpdate( item );
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
