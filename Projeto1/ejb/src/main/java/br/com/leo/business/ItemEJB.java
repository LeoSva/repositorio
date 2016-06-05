package br.com.leo.business;

import javax.ejb.Local;

import br.com.leo.entity.Item;

@Local
public interface ItemEJB {

	public Item findById( int idItem ) throws Exception;
	
	public void saveOrUpdate( Item item ) throws Exception;
	
}
