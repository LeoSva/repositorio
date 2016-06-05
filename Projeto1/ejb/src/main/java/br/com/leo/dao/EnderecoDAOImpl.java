package br.com.leo.dao;

import javax.ejb.Stateless;

import br.com.leo.entity.Endereco;
import br.com.leo.util.BancoDadosUtil;

@Stateless(name="ejb/EnderecoDAO", mappedName="EnderecoDAOImpl")
public class EnderecoDAOImpl implements EnderecoDAO{
	
	@Override
	public Endereco findById( int idEndereco ) throws Exception{
		
		for ( Endereco endereco : BancoDadosUtil.getInstance().getListaEndereco() ) {
			if( endereco.getIdEndereco() == idEndereco ){
				return endereco;
			}
		}
		
		return null;
	}
	
	@Override
	public void saveOrUpdate( Endereco endereco ) throws Exception{
		
		if( endereco.getIdEndereco() > 0 ){
			BancoDadosUtil.getInstance().getListaEndereco().remove( endereco );
		}
		
		BancoDadosUtil.getInstance().getListaEndereco().add( endereco );
	}

}
