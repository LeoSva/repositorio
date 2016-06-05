package br.com.leo.dao;

import javax.ejb.Local;

import br.com.leo.entity.Cliente;

@Local
public interface ClienteDAO {

	public Cliente findById( int idCliente ) throws Exception;

	public void saveOrUpdate( Cliente cliente ) throws Exception;
}
