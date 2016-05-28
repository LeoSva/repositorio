package br.com.leo.dao;

import javax.ejb.Local;

import br.com.leo.entity.Endereco;

@Local
public interface EnderecoDAO {
	
	public Endereco findById( int idEndereco ) throws Exception;
	
	public void saveOrUpdate( Endereco endereco ) throws Exception;

}
