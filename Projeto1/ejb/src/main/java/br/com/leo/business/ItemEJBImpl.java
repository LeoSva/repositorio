package br.com.leo.business;

import javax.ejb.Stateless;

import br.com.leo.entity.Item;

@Stateless(name="ejb/Item", mappedName="ItemEJBImpl")
public class ItemEJBImpl implements ItemEJB {

	@Override
	public Item findById(int idItem) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Item item) throws Exception {
		// TODO Auto-generated method stub

	}

}
