package br.com.leo.dao;

import javax.ejb.Stateless;

import br.com.leo.entity.Item;
import br.com.leo.util.BancoDadosUtil;

@Stateless(name="ejb/ItemDAO", mappedName="ItemDAOImpl")
public class ItemDAOImpl implements ItemDAO {

	@Override
	public Item findById(int idItem) throws Exception {
		for( Item item : BancoDadosUtil.getInstance().getListaItem() ){
			if( item.equals( idItem ) ){
				return item;
			}
		}

		return null;
	}

	@Override
	public void saveOrUpdate(Item item) throws Exception {
		if( item.getIdItem() > 0 ){
			BancoDadosUtil.getInstance().getListaTipoItem().remove( item );
		}

		BancoDadosUtil.getInstance().getListaItem().add( item );
	}

}
