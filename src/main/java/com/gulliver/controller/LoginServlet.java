package com.gulliver.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gulliver.model.Usuario;


@WebServlet("/loginServlet")

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
		throws IOException, ServletException {
		
		String txtLogin = 
				request.getParameter("txtLogin");
		String txtSenha = 
				request.getParameter("txtSenha");
		
		String paginaDestino;
		if (txtLogin.equals("user") &&
				txtSenha.equals("1234")) {
			Usuario usuario = new Usuario ();
			usuario.setLogin("user");
			usuario.setNome("Gulliver");
			usuario.setEmail("oliver@gulliver.com");
			
			request.getSession().setAttribute("User", usuario);
			paginaDestino = "/filtroHotel.jsp";
		}
		else {
			request.setAttribute("Mensagem", "Erro de LOGIN");
			paginaDestino = "/erro.jsp";
		}
		
		RequestDispatcher dispatcher =
				getServletContext()
				.getRequestDispatcher(paginaDestino);
		dispatcher.forward(request, response);
	}

}
