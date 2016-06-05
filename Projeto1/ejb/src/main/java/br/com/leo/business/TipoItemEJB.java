package br.com.leo.business;

import javax.ejb.Local;

import br.com.leo.entity.TipoItem;

@Local
public interface TipoItemEJB {
	
	public TipoItem findById( int idTipoItem ) throws Exception;
	
	public void saveOrUpdate( TipoItem tipoItem ) throws Exception;

}
