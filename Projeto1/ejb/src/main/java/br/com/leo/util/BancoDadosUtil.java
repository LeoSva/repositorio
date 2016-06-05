package br.com.leo.util;

import java.util.ArrayList;
import java.util.List;

import br.com.leo.entity.Cliente;
import br.com.leo.entity.Endereco;
import br.com.leo.entity.Item;
import br.com.leo.entity.Pedido;
import br.com.leo.entity.TipoItem;

public class BancoDadosUtil {
	
	private static BancoDadosUtil banco;
	
	private List<Endereco> listaEndereco = new ArrayList<Endereco>();
	private List<Cliente> listaCliente = new ArrayList<Cliente>();
	private List<TipoItem> listaTipoItem = new ArrayList<TipoItem>();
	private List<Item> listaItem = new ArrayList<Item>();
	private List<Pedido> listaPedido = new ArrayList<Pedido>();
	
	public static BancoDadosUtil getInstance(){
		
		if( banco == null ){
			banco = new BancoDadosUtil();
		}
		
		return banco;
	}
	
	public List<Cliente> getListaCliente() {
		return listaCliente;
	}
	
	public List<Endereco> getListaEndereco() {
		return listaEndereco;
	}
	
	public List<TipoItem> getListaTipoItem() {
		return listaTipoItem;
	}

	public List<Item> getListaItem() {
		return listaItem;
	}
	
	public List<Pedido> getListaPedido() {
		return listaPedido;
	}
	
}
