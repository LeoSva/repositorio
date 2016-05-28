package br.com.leo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import br.com.leo.entity.Endereco;

@Stateless
public class EnderecoDAOImpl implements EnderecoDAO{
	
	private static List<Endereco> listEndereco = new ArrayList<Endereco>();
	
	static{
		
		Endereco endereco = new Endereco();
		
		endereco.setIdEndereco(1);
		endereco.setBairro( "Jardim Itapuã" );
		endereco.setCep( "04188144" );
		endereco.setCidade( "São Paulo" );
		endereco.setEstado( "SP" );
		endereco.setNumero( "199" );
		endereco.setRua( "Jose Amaral do Patrocinio" );
		
		listEndereco.add( endereco );
	}
	
	@Override
	public Endereco findById( int idEndereco ) throws Exception{
		
		for ( Endereco endereco : listEndereco ) {
			if( endereco.getIdEndereco() == idEndereco ){
				return endereco;
			}
		}
		
		return null;
	}
	
	@Override
	public void saveOrUpdate( Endereco endereco ) throws Exception{
		
		if( endereco.getIdEndereco() > 0 ){
			listEndereco.remove( endereco );
		}
		
		listEndereco.add( endereco );
	}

}
