package br.com.leo.servlet;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import br.com.leo.business.EnderecoEJB;
import br.com.leo.entity.Endereco;

public class TestServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();

		try {

			EnderecoEJB enderecoEJB = (EnderecoEJB) new InitialContext().lookup( "java:app/web/ejb/Endereco" );

			Endereco endereco = enderecoEJB.findById(1);
			System.out.println( "==================================" );
			System.out.println( "Rua: " + endereco.getRua() );
			System.out.println( "==================================" );
			
//			destroy();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void destroy() {
		super.destroy();
	}

}
