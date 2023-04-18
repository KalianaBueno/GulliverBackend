package com.gulliver.controller;

import com.gulliver.model.Hoteis;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/escolherHotel")
public class ListaHoteisServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ArrayList<Hoteis> lista = new ArrayList<Hoteis>();

        lista.add(new Hoteis("Ibis Styles São Paulo Anhembi", "Av. Cruzeiro do Sul, 1709 - Santana, São Paulo", 265, 3));
        lista.add(new Hoteis("Confort Ibirapuera", "Av. Sabiá, 825 - Indianópolis, São Paulo", 412, 3));
        lista.add(new Hoteis("Blue Tree Premium Morumbi", "Av. Roque Petroni Júnior, 1000 - Vila Gertrudes, São Paulo", 945, 4));
        lista.add(new Hoteis("Mercure Pamplona", "R. Pamplona, 1315 - Jardim Paulista, São Paulo", 945, 4));
        lista.add(new Hoteis("Sheraton WTC", "Av. das Nações Unidas, 12559 - Brooklin Novo, São Paulo", 796, 5));
        lista.add(new Hoteis("Bourbon Convention Ibirapuera", "Av. Ibirapuera, 2927 - Ibirapuera, São Paulo", 420, 5));
        lista.add(new Hoteis("Blue Tree Premium Paulista", "Rua Peixoto Gomide, 707 - Cerqueira César, São Paulo", 629, 5));
        lista.add(new Hoteis("Golden Tulip Paulista Plaza", "Alameda Santos, 85 - Jardins, São Paulo", 865, 4));
        lista.add(new Hoteis("Renaissance", "Alameda Santos, 2233 - Jardim Paulista, São Paulo", 1240, 5));

        
        
        
        // Get the selected classification from the user's request
        int classificacaoSelecionada = Integer.parseInt(request.getParameter("selectClassif"));

        // Filter the list of hotels by the selected classification
        ArrayList<Hoteis> listaFiltrada = new ArrayList<Hoteis>();
        for (Hoteis hotel : lista) {
            if (hotel.getClassificacao() == classificacaoSelecionada) {
                listaFiltrada.add(hotel);
            }
        }

        // Set the filtered list as a request attribute
        request.setAttribute("listaHoteis", listaFiltrada);

        // Forward the request to the second JSP
        request.getRequestDispatcher("escolherHotel.jsp").forward(request, response);
    }

//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException{
  
}