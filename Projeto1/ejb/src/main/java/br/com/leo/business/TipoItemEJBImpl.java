package br.com.leo.business;

import javax.ejb.Stateless;

import br.com.leo.entity.TipoItem;

@Stateless(name="ejb/TipoItem", mappedName="TipoItemEJBImpl")
public class TipoItemEJBImpl implements TipoItemEJB {

	@Override
	public TipoItem findById(int idTipoItem) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(TipoItem tipoItem) throws Exception {
		// TODO Auto-generated method stub

	}

}
