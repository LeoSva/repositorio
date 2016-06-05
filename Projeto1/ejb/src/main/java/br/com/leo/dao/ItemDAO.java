package br.com.leo.dao;

import javax.ejb.Local;

import br.com.leo.entity.Item;

@Local
public interface ItemDAO {

	public Item findById( int idItem ) throws Exception;

	public void saveOrUpdate( Item item ) throws Exception;

}
