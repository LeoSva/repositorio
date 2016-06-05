package br.com.leo.entity;

import java.io.Serializable;

public class TipoItem implements Serializable{
	
	private static final long serialVersionUID = 809003883747273452L;
	
	private int idTipoItem;
	private String descricao;
	
	public int getIdTipoItem() {
		return idTipoItem;
	}
	public void setIdTipoItem(int idTipoItem) {
		this.idTipoItem = idTipoItem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTipoItem;
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
		TipoItem other = (TipoItem) obj;
		if (idTipoItem != other.idTipoItem)
			return false;
		return true;
	}

}
