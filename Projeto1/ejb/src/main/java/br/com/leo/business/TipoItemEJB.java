package br.com.leo.business;

import br.com.leo.entity.TipoItem;

public interface TipoItemEJB {
	
	public TipoItem findById( int idTipoItem ) throws Exception;
	
	public void saveOrUpdate( TipoItem tipoItem ) throws Exception;

}
