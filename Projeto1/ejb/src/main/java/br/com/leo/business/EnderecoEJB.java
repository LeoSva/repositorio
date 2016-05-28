package br.com.leo.business;

import javax.ejb.Local;

import br.com.leo.entity.Endereco;

@Local
public interface EnderecoEJB {
	
	public Endereco findById( int idEndereco ) throws Exception;
	
	public void saveOrUpdate( Endereco endereco ) throws Exception;

}
