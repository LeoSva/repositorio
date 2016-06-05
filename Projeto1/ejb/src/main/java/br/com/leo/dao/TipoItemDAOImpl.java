package br.com.leo.dao;

import javax.ejb.Stateless;

import br.com.leo.entity.TipoItem;
import br.com.leo.util.BancoDadosUtil;

@Stateless(name="ejb/TipoItemDAO", mappedName="TipoItemDAOImpl")
public class TipoItemDAOImpl implements TipoItemDAO{

	@Override
	public TipoItem findById(int idTipoItem) throws Exception {
		
		for( TipoItem tipoItem : BancoDadosUtil.getInstance().getListaTipoItem() ){
			if( tipoItem.equals( idTipoItem ) ){
				return tipoItem;
			}
		}
		
		return null;
	}
	
	@Override
	public void saveOrUpdate(TipoItem tipoItem) throws Exception {
		
		if( tipoItem.getIdTipoItem() > 0 ){
			BancoDadosUtil.getInstance().getListaTipoItem().remove( tipoItem );
		}
		
		BancoDadosUtil.getInstance().getListaTipoItem().add( tipoItem );
		
	}
	
}
