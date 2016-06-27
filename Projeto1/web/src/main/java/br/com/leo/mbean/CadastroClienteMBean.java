package br.com.leo.mbean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import org.primefaces.event.FlowEvent;

import br.com.leo.business.ClienteEJB;
import br.com.leo.business.EnderecoEJB;
import br.com.leo.entity.Cliente;
import br.com.leo.entity.Endereco;

@ViewScoped
@ManagedBean(name="cadastroClienteMBean")
public class CadastroClienteMBean {

	@EJB
	private EnderecoEJB enderecoEJB;
	
	@EJB
	private ClienteEJB clienteEJB;
	
	private Cliente cliente;

	private Endereco	endereco;

	private List<String> listaEstado;
	
	private String senha;
	private String senha2;

	@PostConstruct
	public void init(){
		try {

			this.endereco = new Endereco();
			this.cliente = new Cliente();
			
			this.listaEstado = new ArrayList<String>();
			
			listaEstado.add( "SP" );
			listaEstado.add( "RJ" );
			listaEstado.add( "PE" );
			listaEstado.add( "AL" );
			listaEstado.add( "BA" );

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String onProximoPasso( FlowEvent event ){

		System.out.println("Foi para o passo seguinte...");
		return event.getNewStep();
	}
	
	public void salvar(){
		
		cliente.setEndereco( endereco );
		
		try {
//			clienteEJB.saveOrUpdate( cliente );
		} 
		catch (Exception e) {
			
			FacesContext.getCurrentInstance().addMessage( null, new FacesMessage( FacesMessage.SEVERITY_ERROR, "Ocorreu um erro ao tentar salvar", "Erro" ) );
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
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha2() {
		return senha2;
	}

	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}

	public void setListaEstado(List<String> listaEstado) {
		this.listaEstado = listaEstado;
	}
	


}
