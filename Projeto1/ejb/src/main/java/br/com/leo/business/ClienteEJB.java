package br.com.leo.business;

import javax.ejb.Local;

import br.com.leo.entity.Cliente;

@Local
public interface ClienteEJB {
	
	public Cliente findById( int idCliente ) throws Exception;
	
	public void saveOrUpdate( Cliente cliente ) throws Exception;

}
