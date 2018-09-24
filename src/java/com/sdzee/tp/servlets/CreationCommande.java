/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdzee.tp.servlets;

import com.sdzee.tp.beans.Client;
import com.sdzee.tp.beans.Commande;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

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
        
        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy hh:mm ");
        String date = dt.toString(fmt);
            
        String nom = request.getParameter("nomClient");
        String prenom = request.getParameter("prenomClient");
        String adresse = request.getParameter("adresseClient");
        String numeroTel = request.getParameter("telephoneClient");
        String mail = request.getParameter("emailClient");
        
        Client client = new Client(nom, prenom, adresse, numeroTel, mail);
        
        String dateCommande = date;
        double montantCommande = parseDouble(request.getParameter("montantCommande"));
        String modePaiement = request.getParameter("modePaiementCommande");
        String statutPaiement = request.getParameter("statutPaiementCommande");
        String modeLivraison = request.getParameter("modeLivraisonCommande");
        String statutLivraison = request.getParameter("statutLivraisonCommande");
                
        Commande commande = new Commande(dateCommande, montantCommande, modePaiement, statutPaiement, modeLivraison, statutLivraison);
        
        
        
        request.setAttribute("client", client);
        request.setAttribute("commande", commande);
	
        this.getServletContext().getRequestDispatcher( "/afficherCommande.jsp" ).forward( request, response );
	}
    
}
