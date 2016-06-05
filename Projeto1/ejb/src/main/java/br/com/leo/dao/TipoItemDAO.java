package br.com.leo.dao;

import javax.ejb.Local;

import br.com.leo.entity.TipoItem;

@Local
public interface TipoItemDAO {

	public TipoItem findById( int idTipoItem ) throws Exception;

	public void saveOrUpdate( TipoItem tipoItem ) throws Exception;

}
