/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdzee.tp.servlets;

import com.sdzee.tp.beans.Client;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.joda.time.DateTime;

/**
 *
 * @author TA-13
 */
public class CreationCommande extends HttpServlet {
    
    public void doGet( HttpServletRequest request, HttpServletResponse response )	throws ServletException, IOException {
        
        DateTime dt = new DateTime();
        Integer jourDuMois = dt.getDayOfMonth();
        Integer mois = dt.getMonthOfYear();
        Integer annee = dt.getYear();
            
        String nom = request.getParameter("nomClient");
        String prenom = request.getParameter("prenomClient");
        String adresse = request.getParameter("adresseClient");
        String numeroTel = request.getParameter("telephoneClient");
        String mail = request.getParameter("emailClient");
        
        Client client = new Client(nom, prenom, adresse, numeroTel, mail);
        
        
        
        
        request.setAttribute("client", client);
	
        this.getServletContext().getRequestDispatcher( "/WEB-INF/creerCommande.jsp" ).forward( request, response );
	}
    
}
