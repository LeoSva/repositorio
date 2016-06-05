package br.com.leo.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.leo.dao.TipoItemDAO;
import br.com.leo.entity.TipoItem;

@Stateless(name="ejb/TipoItem", mappedName="TipoItemEJBImpl")
public class TipoItemEJBImpl implements TipoItemEJB {

	@EJB
	private TipoItemDAO tipoItemDAO;
	
	@Override
	public TipoItem findById(int idTipoItem) throws Exception {

		try{
			return tipoItemDAO.findById(idTipoItem);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void saveOrUpdate(TipoItem tipoItem) throws Exception {
		
		try{
			tipoItemDAO.saveOrUpdate( tipoItem );
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
