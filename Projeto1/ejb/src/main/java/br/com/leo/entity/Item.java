package br.com.leo.entity;

import java.io.Serializable;

public class Item implements Serializable{
	
	private static final long serialVersionUID = -2095335689525895754L;
	
	private int idItem;
	private String descricao;
	private Double valorUnitario;
	private Integer quantidadeDisponivel;
	private TipoItem tipoItem;
	
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public Integer getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}
	public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	public TipoItem getTipoItem() {
		return tipoItem;
	}
	public void setTipoItem(TipoItem tipoItem) {
		this.tipoItem = tipoItem;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idItem;
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
		Item other = (Item) obj;
		if (idItem != other.idItem)
			return false;
		return true;
	}
	
}
