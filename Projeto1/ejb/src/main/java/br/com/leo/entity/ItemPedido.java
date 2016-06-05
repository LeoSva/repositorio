package br.com.leo.entity;

import java.io.Serializable;

public class ItemPedido implements Serializable{
	
	private static final long serialVersionUID = 7832587277248925975L;
	
	private Pedido pedido;
	private Item item;
	private Double valorItemPedido;
	private Double valorDescontoItemPedido;
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Double getValorItemPedido() {
		return valorItemPedido;
	}
	public void setValorItemPedido(Double valorItemPedido) {
		this.valorItemPedido = valorItemPedido;
	}
	public Double getValorDescontoItemPedido() {
		return valorDescontoItemPedido;
	}
	public void setValorDescontoItemPedido(Double valorDescontoItemPedido) {
		this.valorDescontoItemPedido = valorDescontoItemPedido;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPedido other = (ItemPedido) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (pedido == null) {
			if (other.pedido != null)
				return false;
		} else if (!pedido.equals(other.pedido))
			return false;
		return true;
	}
	
}
