package br.com.leo.mbean;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.leo.business.ClienteEJB;
import br.com.leo.entity.Cliente;

@ViewScoped
@ManagedBean(name="clienteMBean")
public class ClienteMBean {
	
	@EJB
	private ClienteEJB clienteEJB;
	
	private Cliente cliente;
	
	@PostConstruct
	public void init(){
		
		cliente = new Cliente();
		
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
