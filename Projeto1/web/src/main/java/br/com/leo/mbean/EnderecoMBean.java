package br.com.leo.mbean;

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
	
	@PostConstruct
	public void init(){
		
		try {
			
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

}
