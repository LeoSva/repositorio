package br.com.leo.mbean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import br.com.leo.business.EnderecoEJB;
import br.com.leo.entity.Endereco;

@ViewScoped
@ManagedBean(name="EnderecoMBean")
public class EnderecoMBean {
	
	@EJB
	private EnderecoEJB enderecoEJB;
	
	private Endereco	endereco;
	
	private List<String> listaEstado;
	
	@PostConstruct
	public void init(){
		
		try {
			
			this.listaEstado = new ArrayList<String>();
			
			listaEstado.add( "SP" );
			listaEstado.add( "RJ" );
			listaEstado.add( "PE" );
			listaEstado.add( "AL" );
			listaEstado.add( "BA" );
			
			this.endereco = enderecoEJB.findById(1);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public List<String> getListaEstado() {
		return listaEstado;
	}
	
}
